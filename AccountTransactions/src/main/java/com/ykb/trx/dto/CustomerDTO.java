package com.ykb.trx.dto;

import javax.persistence.Entity;

public class CustomerDTO {
	public CustomerDTO() {
		super();
	}
	  private Long id;
	  private Integer customerNo;
	  private String customerName;
	 
	 
	public CustomerDTO(Long id, Integer customerNo, String customerName) {
		super();
		this.id = id;
		this.customerNo = customerNo;
		this.customerName = customerName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	 
	 
}
