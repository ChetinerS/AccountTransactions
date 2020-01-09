package com.ykb.trx.dto;

import java.util.List;

public class AccountTransactionDTO {
	private  List<AccountDTO> accountDTOList;
	private List<TransactionDTO> mainAccountTransactionList;
	public List<AccountDTO> getAccountDTOList() {
		return accountDTOList;
	}
	public void setAccountDTOList(List<AccountDTO> accountDTOList) {
		this.accountDTOList = accountDTOList;
	}
	public List<TransactionDTO> getMainAccountTransactionList() {
		return mainAccountTransactionList;
	}
	public void setMainAccountTransactionList(List<TransactionDTO> mainAccountTransactionList) {
		this.mainAccountTransactionList = mainAccountTransactionList;
	}

}
