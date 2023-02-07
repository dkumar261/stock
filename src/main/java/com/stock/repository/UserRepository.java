/**
 * 
 */
package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.domain.UserDetail;

/**
 * @author Dinesh
 *
 */

@Repository
public interface UserRepository extends JpaRepository<UserDetail,Integer> {

}
