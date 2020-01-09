package com.ykb.trx.feign;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ykb.trx.dto.AccountDTO;

@FeignClient(name = "account-service")
public interface AccountClient {
	@GetMapping(value = "/account-list/customer/{id}")
	public @ResponseBody List<AccountDTO> getAccountsByCustomerId(@PathVariable Long id) ;
	
	@GetMapping(value = "/account-list/mainAccount/customerNo/{customerNo}")
	public @ResponseBody AccountDTO getMainAccountByCustomerNo(@PathVariable Integer customerNo) ;
	
	
}
