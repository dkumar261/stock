package com.stock.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.model.StockModel;
import com.stock.rest.RestConstants;
import com.stock.service.StockService;

import io.swagger.annotations.Api;

@RestController
@Api()
@RequestMapping(path = RestConstants.API_BASE)
public class StockController {

	@Resource
	private StockService stockService;

	@PostMapping(value = "/stock")
	public StockModel create(@RequestBody StockModel stockModel) {
		StockModel 	savedStockmodel = stockService.create(stockModel);
		return savedStockmodel;
	}
}
