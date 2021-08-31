package com.pichincha.backend.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class AccountDto {

	private  String number;

	private  String type;

	private  LocalDateTime creationDate;

	

	public AccountDto(String number, String type, LocalDateTime creationDate) {
		
		this.number = number;
		this.type = type;
		this.creationDate = creationDate;
	}

}