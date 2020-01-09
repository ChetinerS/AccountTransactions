package com.ykb.trx.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.ykb.trx.dto.TransactionDTO;

public interface ITransactionsService {
	@Async("asyncExecutor")
	public CompletableFuture<List<TransactionDTO>> getTransactionsOfMainAccountByCustomerNo(Integer customerNo);

}