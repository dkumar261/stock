/**
 * 
 */
package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.domain.UserDetail;

/**
 * @author Dinesh
 *
 */
public interface UserRepository extends JpaRepository<UserDetail,Integer> {

}
