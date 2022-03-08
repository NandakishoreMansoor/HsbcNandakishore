package com.customer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface transcationRepo<Transactionss> extends JpaRepository<Transactionss, Integer>{
	
	@Query("from customer c where c.cid=?1 ")
	Optional<Transactionss> findBytrtype(String trtype, String amount); 
	
	List<Transactionss> findByttype(String ttype);
	

}
