package com.driver.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.model.Settlement;
import com.driver.repository.SettlementRepository;
import com.driver.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {
//inject repository
	@Autowired
	private SettlementRepository settlementRepository;
	@Override
	public Settlement saveSettlements(Settlement settlement) {
		Settlement settlemet=settlementRepository.save(settlement);
		return settlement;
	}
	@Override
	public Settlement updateSettlements(Settlement settlement) {
	Settlement settlement1=settlementRepository.save(settlement);
		return settlement;
	}
	@Override
	public Settlement getSettlements(Integer id) {
		Settlement settlement=settlementRepository.findById(id).get();
		return settlement;
	}
	@Override
	public void deleteSettlement(Integer id) {
		// TODO Auto-generated method stub
		settlementRepository.deleteById(id);
	}
	

}
