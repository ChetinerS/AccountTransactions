package com.ykb.trx.dto;

public class AccountDTO {

	private Long id;
	private Integer accountNo;
	private String accountName;
	private Long customerId;
	private String isMainAccount;
	
	public AccountDTO() {
		super();
	}
	 
	public AccountDTO(Long id, Integer accountNo, String accountName, Long customerId, String isMainAccount) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.customerId = customerId;
		this.isMainAccount = isMainAccount;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	 
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getIsMainAccount() {
		return isMainAccount;
	}
	public void setIsMainAccount(String isMainAccount) {
		this.isMainAccount = isMainAccount;
	}
	 

	 

}
