package com.settlement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.settlement.model.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement,Integer> {
public Optional<Settlement> findById(Integer id);
}
