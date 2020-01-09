package com.ykb.trx.feign;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ykb.trx.dto.TransactionDTO;

@FeignClient(name = "transaction-service")
public interface TransactionClient {
	@GetMapping(value = "/transaction/account/{accountId}")
	public List<TransactionDTO> findByAccountId(@PathVariable Long accountId) ;
	
	 
}
