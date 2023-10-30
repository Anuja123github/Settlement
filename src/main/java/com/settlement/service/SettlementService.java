package com.settlement.service;

import com.settlement.model.Settlement;

public interface SettlementService {
	public Settlement saveSettlements(Settlement settlement);
	
	public Settlement updateSettlements(Settlement settlement);
	public Settlement getSettlements(Integer id);
	public void deleteSettlement(Integer id);

}
