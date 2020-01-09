package com.ykb.trx.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ykb.trx.dto.AccountDTO;
import com.ykb.trx.dto.CustomerDTO;
import com.ykb.trx.dto.TransactionDTO;
import com.ykb.trx.feign.AccountClient;
import com.ykb.trx.feign.CustomerClient;
import com.ykb.trx.feign.TransactionClient;
@Component
public class TransactionsService implements ITransactionsService {

 
	@Autowired
	AccountClient accountClient;
	
	@Autowired
	TransactionClient transactionClient;
	 
	@Override
	public CompletableFuture<List<TransactionDTO>> getTransactionsOfMainAccountByCustomerNo(Integer customerNo) {
		System.out.println( Thread.currentThread().getName());
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	 
		AccountDTO mainAccountByCustomerNo = accountClient.getMainAccountByCustomerNo(customerNo);
		
	 
		List<TransactionDTO> findByAccountId = transactionClient.findByAccountId(mainAccountByCustomerNo.getId());
 
		return CompletableFuture.completedFuture(findByAccountId);
	}

}
