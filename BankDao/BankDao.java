package com.bankApplication.BankDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankApplication.Bank.Bank;
import com.bankApplication.BankRepository.BankRepository;
@Repository
public class BankDao {
	@Autowired
	BankRepository bRepo;
	public String addBank( List<Bank> bnk) {
		 bRepo.saveAll(bnk);
		 return "Bank list saved successfully";
}
	public String getIfsc( String branch, String name) {
		return bRepo.getIfscByBranchName(branch,name);
	}
	
}
