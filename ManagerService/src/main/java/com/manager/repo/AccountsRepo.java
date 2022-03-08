package com.manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.model.Accounts;

public interface AccountsRepo extends JpaRepository<Accounts, Integer> {

}
