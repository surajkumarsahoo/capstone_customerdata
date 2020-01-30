package com.mindtree.bankdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bankdata.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
