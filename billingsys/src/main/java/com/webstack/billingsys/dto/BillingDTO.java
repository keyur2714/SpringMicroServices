package com.webstack.billingsys.dto;

import java.util.Date;
import java.util.List;

public class BillingDTO {

	private long billNo;
	private Date billDate;

	private CustomerDTO customer;
	private List<ItemsDTO> items;

	public long getBillNo() {
		return billNo;
	}

	public void setBillNo(long billNo) {
		this.billNo = billNo;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public List<ItemsDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemsDTO> items) {
		this.items = items;
	}

}
