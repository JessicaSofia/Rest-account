package com.pichincha.backend.test.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private Long id ; 
	
	private Long accountId;
	
	@Column(length = 70)
	private String type; 
	
	private  String comment;
	
	private LocalDateTime creationDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Transaction(Long accountId, String type, String comment, LocalDateTime creationDate) {
		super();
		this.accountId = accountId;
		this.type = type;
		this.comment = comment;
		this.creationDate = creationDate;
	}


	
	
}
	


