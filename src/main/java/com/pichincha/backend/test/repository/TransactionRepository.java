package com.pichincha.backend.test.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pichincha.backend.test.model.Transaction;

public interface  TransactionRepository extends JpaRepository<Transaction, Long> {

	public List<Transaction> GetListTransactionByAcountId(Long accountId, Sort sort );  
} 
