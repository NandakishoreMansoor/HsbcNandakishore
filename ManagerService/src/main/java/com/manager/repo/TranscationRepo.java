package com.manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.manager.model.Transactions;

import antlr.collections.List;

@Repository
	public interface TranscationRepo extends JpaRepository<Transactions, Integer>{
	@Query("select u from Transaction u where u.cid=?1")
	public List findAllCustomerAccounts(int cid);
	}



