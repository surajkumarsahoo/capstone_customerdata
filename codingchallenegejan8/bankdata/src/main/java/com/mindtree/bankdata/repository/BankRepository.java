package com.mindtree.bankdata.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bankdata.entity.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {

	Optional<Bank> findBybankName(String bankName);

}
