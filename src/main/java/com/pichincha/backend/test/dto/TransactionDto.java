package com.pichincha.backend.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class TransactionDto {

	private  Long id;

	private  String comment;

	private  String type;

	private  LocalDateTime creationDate;

	public TransactionDto(Long id, String comment, String type, LocalDateTime creationDate) {
		super();
		this.id = id;
		this.comment = comment;
		this.type = type;
		this.creationDate = creationDate;
	}
	
	
	

}
