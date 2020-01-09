package com.ykb.trx.dto;

import java.math.BigDecimal;

import javax.persistence.Entity;

public class TransactionDTO {
	private Long id;
	private BigDecimal amount;
	private Long fromAccountId;
	private Long toAccountId;

	public TransactionDTO(Long id, BigDecimal amount, Long fromAccountId, Long toAccountId) {
		super();
		this.id = id;
		this.amount = amount;
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;

	}

	public TransactionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public Long getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(Long toAccountId) {
		this.toAccountId = toAccountId;
	}

 

}
