package com.stock.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.model.UserDetailModel;
import com.stock.rest.RestConstants;
import com.stock.service.UserDetailService;

import io.swagger.annotations.Api;

@RestController
@Api()
@RequestMapping(path=RestConstants.API_BASE)
public class UserDetailsController {

	@Resource
	private UserDetailService userDetailService;
	
	public String authenticateUser() {
		return null;
	}
	
	@PostMapping(value="/user")
	public String createUser(@RequestBody UserDetailModel userDetailModel) {

		userDetailService.createUser(userDetailModel);
		return null;
	}
}
