package com.ykb.trx.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ykb.trx.dto.AccountDTO;
import com.ykb.trx.dto.AccountTransactionDTO;
import com.ykb.trx.dto.TransactionDTO;
import com.ykb.trx.service.IAccountService;
import com.ykb.trx.service.ITransactionsService;

@RequestMapping("api/v1/account-transaction")
@RestController
public class AccountTransactionController {

	@Autowired
	IAccountService accountTransactionsService;
	@Autowired
	ITransactionsService transactionsService;

 

//	HESAPLARI- ANA HESABIN TRANSACTIONLARINI GETIREN REST COMPOSITE SERVICE 
	@GetMapping(value = "/customer/{customerNo}")
	public @ResponseBody AccountTransactionDTO getAccountAndTransactions(@PathVariable Integer customerNo) throws Throwable {
		long start = System.currentTimeMillis();
		CompletableFuture<List<AccountDTO>> accounts = accountTransactionsService.getAccountsOfCustomer(customerNo);
		System.out.println("Elapsed time-getAccountsOfCustomer: " + (System.currentTimeMillis() - start));
		System.out.println("*****");
		long start3 = System.currentTimeMillis();
		CompletableFuture<List<TransactionDTO>> trxs = transactionsService
				.getTransactionsOfMainAccountByCustomerNo(customerNo);
		System.out.println("Elapsed time-getTransactionsOfMainAccountByCustomerNo: " + (System.currentTimeMillis() - start3));
		System.out.println("TOTAL: " + (System.currentTimeMillis() - start));
		long startCompletableFuture = System.currentTimeMillis();
		List<AccountDTO> accountList = new ArrayList<>(accounts.join());
		List<TransactionDTO> trxList = new ArrayList<>(trxs.join());
		AccountTransactionDTO dtoList=new AccountTransactionDTO();
		dtoList.setAccountDTOList(accountList);
		dtoList.setMainAccountTransactionList(trxList);
		System.out.println("Elapsed time CompletableFuture: " + (System.currentTimeMillis() - startCompletableFuture));

		return dtoList;
	}
	
	
}
