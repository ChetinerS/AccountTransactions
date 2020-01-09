package com.ykb.trx.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ykb.trx.dto.CustomerDTO;

@FeignClient(name = "customer-service")
public interface CustomerClient {
	
	@GetMapping(value = "/customer/customerNo/{customerNo}")
	public  @ResponseBody CustomerDTO findByCustomerNo(@PathVariable Integer customerNo) ;

}
