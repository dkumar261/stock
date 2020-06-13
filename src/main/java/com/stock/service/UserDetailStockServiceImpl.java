/**
 * 
 */
package com.stock.service;

import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.stock.domain.Stock;
import com.stock.domain.UserDetail;
import com.stock.domain.UserStock;
import com.stock.model.UserStockModel;
import com.stock.repository.StockRepository;
import com.stock.repository.UserRepository;
import com.stock.repository.UserStockRespository;

/**
 * @author Dinesh
 *
 */
@Service
public class UserDetailStockServiceImpl implements UserDetailStockService {

	@Resource
	private UserStockRespository userStockRespository;

	@Resource
	private UserRepository userRepository;

	@Resource
	private StockRepository stockRepository;

	@Resource
	private ModelMapper modelMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.stock.service.UserDetailStockService#create(com.stock.model.
	 * UserStockModel)
	 */
	@Override
	public UserStockModel create(UserStockModel userStockModel, Integer userId, Integer stockId) {

		UserDetail userDetail = userRepository.getOne(userId);
		Stock stock = stockRepository.getOne(stockId);

		UserStock userStock = modelMapper.map(userStockModel, UserStock.class);
		if (userStock != null) {
			userStock.setUserDetail(userDetail);
			userStock.setStock(stock);
			userStock.setCreatedAt(LocalDateTime.now());
			userStock.setInvestmentValue(stockCalculation(userStockModel));

			UserStock saveUserStock = userStockRespository.save(userStock);
			userStockModel = modelMapper.map(saveUserStock, UserStockModel.class);
		}
		return userStockModel;
	}

	private Long stockCalculation(UserStockModel userStockModel) {
		Long total= 0L;
//		if (userStockModel.getPrice() != null && userStockModel.getQuantities() != null) {
//			total = userStockModel.getPrice() + userStockModel.getQuantities();
//		}
		return total;
	}
}
