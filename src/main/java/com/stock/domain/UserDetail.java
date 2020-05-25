/**
 * 
 */
package com.stock.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Dinesh
 *
 */
@Table(name = "User_Detail")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String password;
	
	@OneToMany(mappedBy="userDetail")
	private List<UserStock>userStocks;
}
