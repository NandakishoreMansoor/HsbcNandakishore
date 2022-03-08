package com.customer.model;

public class Transactionss {
	public int tid;
	public String trtype;
	public String tamount;
	public String date;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTrtype() {
		return trtype;
	}
	public void setTrtype(String trtype) {
		this.trtype = trtype;
	}
	public String getTamount() {
		return tamount;
	}
	public void setTamount(String tamount) {
		this.tamount = tamount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Transactionss() {
	} 
	 public Transactionss(int tid, String trtype, String tamount, String date) {
		super();
		this.tid = tid;
		this.trtype = trtype;
		this.tamount = tamount;
		this.date = date;
	}
}







