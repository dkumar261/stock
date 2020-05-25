package com.stock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserStockModel {

	private Integer id;
	private Integer quantities;
	private Long currentPrice;
	private Long currentValue;
	private Long averagePrice;
	private Long price;
	private Long profitAndLoss;
	
}
