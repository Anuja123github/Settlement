package com.settlement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.settlement.model.Settlement;
import com.settlement.service.SettlementService;

@RestController
public class SettlementController {
	// injectservice
	@Autowired
	private SettlementService settlementService;

	@PostMapping("/addSettlementsDetails")
	public ResponseEntity<Settlement> saveSettlements(@RequestBody Settlement settlement) {
		Settlement settlement1 = settlementService.saveSettlements(settlement);
		return ResponseEntity.ok().body(settlement1);

	}

	@PutMapping("/updateDetails")
	public ResponseEntity<Settlement> updateSettlements(@RequestBody Settlement settlement) {
		Settlement settlement1 = settlementService.updateSettlements(settlement);
		return ResponseEntity.ok().body(settlement1);

	}
@GetMapping("/getSettlementById/{id}")
	public ResponseEntity<Settlement> getSettlements(@PathVariable("id") Integer id) {
		Settlement settlement = settlementService.getSettlements(id);
		return ResponseEntity.ok().body(settlement);

	}
@DeleteMapping("/deleteSettlement/{id}")
public String deleteSettlement(@PathVariable("id")Integer id) {
	settlementService.deleteSettlement(id);
	return"deleteRecord";
	
}


}