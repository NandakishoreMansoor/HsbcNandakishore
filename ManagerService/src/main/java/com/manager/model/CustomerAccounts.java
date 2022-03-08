package com.manager.model;

import java.util.Date;

public class CustomerAccounts {
	public int accno;
	public int cid;
	public String accttype;
	public int balance;
	private Date date;
	public CustomerAccounts(int accno, int cid, String accttype, int balance, Date date) {
		super();
		this.accno = accno;
		this.cid = cid;
		this.accttype = accttype;
		this.balance = balance;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CustomerAccounts() {
	} 
	
	public int getAccno() {
	return accno;
	} 
	public void setAccno(int accno) {
	this.accno = accno;
	}
	public int getCid() {
	return cid;
	}
	public void setCid(int cid) {
	this.cid = cid;
	}
	public String getAccttype() {
	return accttype;
	}
	public void setAccttype(String accttype) {
	this.accttype = accttype;
	}
	public int getBalance() {
	return balance;
	}
	public void setBalance(int balance) {
	this.balance = balance;
	}
	}



