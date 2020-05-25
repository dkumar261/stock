package com.stock.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailModel {
	
	private Integer id;
	private String name;
	private String userName;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String password;
}
