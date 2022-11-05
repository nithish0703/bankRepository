package com.bankApplication.BankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankApplication.Bank.Bank;
import com.bankApplication.BankService.BankService;



@RestController
public class BankController {

	@Autowired
	BankService bSer;
	@PostMapping("/addBankList")
	public String addBank(@RequestBody List<Bank> bnk) {
		return bSer.addBank(bnk);
	}
	@GetMapping("/getIfscCode/{branch}/{name}")
	public String getIfsc(@PathVariable String branch,@PathVariable String name) {
		return bSer.getIfsc(branch,name);
	}
}
