package com.stock.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockModel {

	private Long id;
	private String name;
	private Long price;
	private Long lowPrice;
	private Long highPrice;
	private Long totalQuantities;
	private Date createDate;
}
