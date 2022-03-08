package com.customer.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transaction;

@Entity
public class Customer {
	
	@Id
	@Column(columnDefinition = "integer default 500")
	public int cid;
	public String cname;
	public String caddress;
	public int cbalance;
	
	
	public int getCbalance() {
		return cbalance;
	}
	public void setCbalance(int cbalance) {
		this.cbalance = cbalance;
	}
	public int getCid() {
	return cid;
	} 
	public void setCid(int cid) {
	this.cid = cid;
	}
	public String getCname() {
	return cname;
	} 
	public void setCname(String cname) {
	this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	public List<Transaction> insertCustomer1() {
		return null;
	}
	public List<Transactionss> findBytrtype(String trtype) {

		return null;
	}
	}
