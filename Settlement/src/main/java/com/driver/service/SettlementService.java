package com.driver.service;

import com.driver.model.Settlement;

public interface SettlementService {
	public Settlement saveSettlements(Settlement settlement);
	
	public Settlement updateSettlements(Settlement settlement);
	public Settlement getSettlements(Integer id);
	public void deleteSettlement(Integer id);

}
