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
	public UserDetailModel createUser(@RequestBody UserDetailModel userDetailModel) {
		UserDetailModel detailModel = userDetailService.createUser(userDetailModel);
		return detailModel;
	}
}
