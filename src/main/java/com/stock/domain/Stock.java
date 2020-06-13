package com.stock.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Dinesh
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Long currentPrice;
	private Long lowPrice;
	private Long highPrice;
	private Long totalQuantities;
	private Date createDate;

	@OneToMany(mappedBy = "stock")
	private List<UserStock> userStocks;
}
