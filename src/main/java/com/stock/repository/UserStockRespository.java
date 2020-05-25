package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.domain.UserStock;

@Repository
public interface UserStockRespository extends JpaRepository<UserStock,Integer> {

}
