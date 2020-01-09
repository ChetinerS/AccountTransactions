package com.ykb.trx.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ykb.trx.dto.AccountDTO;
import com.ykb.trx.dto.CustomerDTO;
import com.ykb.trx.feign.AccountClient;
import com.ykb.trx.feign.CustomerClient;

@Component
public class AccountService implements IAccountService {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	AccountClient accountClient;

	@Autowired
	private CustomerClient customerClient;

	@Override
	@HystrixCommand(fallbackMethod = "failed")
	public CompletableFuture<List<AccountDTO>> getAccountsOfCustomer(Integer customerNo) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		CustomerDTO findByCustomerNo = customerClient.findByCustomerNo(customerNo);

		// find accounts
		List<AccountDTO> accountList = accountClient.getAccountsByCustomerId(findByCustomerNo.getId());

		return CompletableFuture.completedFuture(accountList);
	}

	public List<AccountDTO> failed(Integer customerNo) {
		return null;
	}

}
