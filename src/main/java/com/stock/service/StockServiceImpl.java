package com.stock.service;

import java.util.Date;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.stock.domain.Stock;
import com.stock.model.StockModel;
import com.stock.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Resource
	private StockRepository stockRepository;

	@Resource
	private ModelMapper modelMapper;

	@Override
	public StockModel create(StockModel stockModel) {
		
		Stock stock = modelMapper.map(stockModel, Stock.class);
		if(stock!=null) {
			stock.setCreateDate(new Date());
			Stock saveStock = stockRepository.save(stock);
			stockModel = modelMapper.map(saveStock, StockModel.class);
		}
		return stockModel;
	}
}
