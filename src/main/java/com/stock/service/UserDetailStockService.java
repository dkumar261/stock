package com.stock.service;

import com.stock.model.UserStockModel;

public interface UserDetailStockService {

	UserStockModel create(UserStockModel userStockModel, Integer userId, Integer stockId);
}
