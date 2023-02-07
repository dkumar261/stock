package com.stock.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.model.UserStockModel;
import com.stock.rest.RestConstants;
import com.stock.service.UserDetailStockService;

import io.swagger.annotations.Api;

@RestController
@Api()
@RequestMapping(path = RestConstants.API_BASE)
public class UserStockController {

	@Resource
	private UserDetailStockService userDetailStockService;

	@PostMapping(value = "/buy/userId/{userId}/stockId/{stockId}")
	public UserStockModel create(@PathVariable("userId") Integer userId, @PathVariable("stockId") Integer stockId,
			@RequestBody UserStockModel userStockModel) {
		UserStockModel savedUserStockModel = userDetailStockService.create(userStockModel,userId,stockId);
		return savedUserStockModel;
	}

	@PostMapping(value = "/sell/userId/{userId}/stockId/{stockId}")
	public UserStockModel sell(@PathVariable("userId") Integer userId, @PathVariable("stockId") Integer stockId,
			@RequestBody UserStockModel userStockModel) {
		UserStockModel savedUserStockModel = userDetailStockService.create(userStockModel,userId,stockId);
		return savedUserStockModel;
	}
}
