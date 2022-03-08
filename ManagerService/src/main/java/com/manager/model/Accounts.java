package com.manager.model;

public class Accounts {
	
	public String accounttype;
	public int minimumbalance;
	public int rateofinterest;
	public Accounts() {
		
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getMinimumbalance() {
		return minimumbalance;
	}
	public void setMinimumbalance(int minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
	public Accounts(String accounttype, int minimumbalance, int rateofinterest) {
		super();
		this.accounttype = accounttype;
		this.minimumbalance = minimumbalance;
		this.rateofinterest = rateofinterest;
	}
	public int getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(int rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
}


