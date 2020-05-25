/**
 * 
 */
package com.stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@GeneratedValue
	private Integer id;
	private String name;
	private String password;

}
