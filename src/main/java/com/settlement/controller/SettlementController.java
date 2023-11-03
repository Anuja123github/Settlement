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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class SettlementController {
	// injectservice
	@Autowired
	private SettlementService settlementService;

	@PostMapping("/addSettlementsDetails")
	@ApiOperation(value = "Request to add settlement details")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"), 
			@ApiResponse(code = 400, message = "Invalid Request"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<Settlement> saveSettlements(@RequestBody Settlement settlement) {
		Settlement settlement1 = settlementService.saveSettlements(settlement);
		return ResponseEntity.ok().body(settlement1);

	}

	@PutMapping("/updateDetails")
	@ApiOperation(value = "Request to edit settlement details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<Settlement> updateSettlements(@RequestBody Settlement settlement) {
		Settlement settlement1 = settlementService.updateSettlements(settlement);
		return ResponseEntity.ok().body(settlement1);

	}

	@GetMapping("/getSettlementById/{id}")
	@ApiOperation(value = "Request to get settlement details using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<Settlement> getSettlements(@PathVariable("id") Integer id) {
		Settlement settlement = settlementService.getSettlements(id);
		return ResponseEntity.ok().body(settlement);

	}

	@DeleteMapping("/deleteSettlement/{id}")
	@ApiOperation(value = "Request to delete settlement details using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public String deleteSettlement(@PathVariable("id") Integer id) {
		settlementService.deleteSettlement(id);
		return "deleteRecord";

	}

}