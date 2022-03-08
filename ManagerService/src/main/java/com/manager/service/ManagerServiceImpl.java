package com.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.manager.model.CustomerAccounts;
import com.manager.model.Transactions;
import com.manager.repo.AccountsRepo;
import com.manager.repo.ManagerRepo;

public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerRepo mrepo;

	@Autowired
	AccountsRepo accrepo;

	@Autowired
	RestTemplate template;

	@Override
	public void deleteCustomer(int cid) {

	}

	@Override
	public List<CustomerAccounts> displayAllCustomers() {

		return mrepo.findAll();
	}

	@Override
	public CustomerAccounts custInfoById(int id) {
		Optional<CustomerAccounts> opt = mrepo.findById(id);
		return opt.get();

	}

}
