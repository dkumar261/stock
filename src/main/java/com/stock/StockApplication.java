package com.stock;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stock.domain.Stock;
import com.stock.model.StockModel;

/**
 * 
 * @author Dinesh
 *
 */

@SpringBootApplication
public class StockApplication {

	@Resource
	private ModelMapper modelMapper;

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}

	//@Override
	public void run(String... args) throws Exception {
	
		StockModel stockModel = new StockModel();
		stockModel.setName("TEst");
		Stock stock = modelMapper.map(stockModel, Stock.class);		
		stockModel = modelMapper.map(stock, StockModel.class);
		System.out.println(stockModel);
	}
}
