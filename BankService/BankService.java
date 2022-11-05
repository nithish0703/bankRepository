package com.bankApplication.BankService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bankApplication.Bank.Bank;
import com.bankApplication.BankDao.BankDao;
@Service
public class BankService {
	@Autowired
	BankDao bDao;
	public String addBank( List<Bank> bnk) {
		return bDao.addBank(bnk);
	}
	public String getIfsc( String branch, String name) {
		return bDao.getIfsc(branch,name);
	}
}
