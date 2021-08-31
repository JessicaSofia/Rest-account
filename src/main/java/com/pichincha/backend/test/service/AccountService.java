package com.pichincha.backend.test.service;


import com.pichincha.backend.test.dto.AccountDto;
import com.pichincha.backend.test.dto.NewTransactionDto;
import com.pichincha.backend.test.dto.TransactionDto;
import com.pichincha.backend.test.model.Transaction;
import com.pichincha.backend.test.repository.AccountRepository;
import com.pichincha.backend.test.repository.TransactionRepository;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class AccountService {

	private final AccountRepository accountRepository;
	private final TransactionRepository transactionRepository; 

	public AccountService(AccountRepository accountRepository, TransactionRepository transactionRepository ) {
		this.accountRepository = accountRepository;
		this.transactionRepository = transactionRepository;
	}

	public AccountDto getAccount(Long id) {
		return accountRepository.findById(id)
			.map(account -> new AccountDto(account.getNumber(), account.getType(), account.getCreationDate()))
			.orElse(null);
	}

	/**
	 * Returns a list of all transactions for a account with passed id.
	 *
	 * @param accountId id of the account
	 * @return list of transactions sorted by creation date descending - most recent first
	 */
	public List<TransactionDto> getTransactionsForAccount(Long accountId) {
		
		
		return transactionRepository.GetListTransactionByAcountId(accountId, Sort.by(Sort.Direction.DESC, "creationDate")).stream()
				.map(s -> new TransactionDto(s.getId(), s.getComment(), s.getType(), s.getCreationDate())).collect(Collectors.toList());
		
	}

	/**
	 * Creates a new transaction
	 *
	 * @param newTransactionDto data of new transaction
	 * @return id of the created transaction
	 * @throws IllegalArgumentException if there is no account for passed newTransactionDto.accountId
	 */
	public Long addTransaction(NewTransactionDto newTransactionDto) {
		if (newTransactionDto !=null) {
			
			Long accountId = newTransactionDto.getAccountId();
			
		if(accountRepository.existsById(accountId)) {
		
			Transaction nuevo = newTransactionDto.
			transactionRepository.save(newTransactionDto);
		}
		else
		{
			
		
		}
			
		}
	}

}
