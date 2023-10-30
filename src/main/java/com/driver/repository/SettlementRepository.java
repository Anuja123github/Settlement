package com.driver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.driver.model.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement,Integer> {
public Optional<Settlement> findById(Integer id);
}
