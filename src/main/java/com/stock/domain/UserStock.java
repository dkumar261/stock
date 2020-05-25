package com.stock.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserStock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer quantities;
	private Long currentPrice;
	private Long currentValue;
	private Long averagePrice;
	private Long profitAndLoss;
	private Long price;
	private Long investmentValue;
	private LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserDetail userDetail;

	@ManyToOne
	@JoinColumn(name = "stock_id")
	private Stock stock;
}
