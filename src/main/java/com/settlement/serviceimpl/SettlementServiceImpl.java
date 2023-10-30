package com.settlement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.settlement.model.Settlement;
import com.settlement.repository.SettlementRepository;
import com.settlement.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {
//inject repository
	@Autowired
	private SettlementRepository settlementRepository;
	@Override
	public Settlement saveSettlements(Settlement settlement) {
		Settlement settlement1=settlementRepository.save(settlement);
		return settlement1;
	}
	@Override
	public Settlement updateSettlements(Settlement settlement) {
	Settlement settlement1=settlementRepository.save(settlement);
		return settlement1;
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
