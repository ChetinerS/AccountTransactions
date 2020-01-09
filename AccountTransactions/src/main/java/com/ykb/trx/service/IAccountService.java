package com.ykb.trx.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.ykb.trx.dto.AccountDTO;

public interface IAccountService {
	@Async("asyncExecutor")
	public CompletableFuture<List<AccountDTO>> getAccountsOfCustomer(Integer customerNo);

}