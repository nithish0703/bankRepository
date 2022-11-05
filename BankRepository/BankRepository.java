package com.bankApplication.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bankApplication.Bank.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

	@Query(value="select ifsc_code from bank where branch=:branch and name=:name ",nativeQuery =true)
	public String getIfscByBranchName(@Param("branch") String branch,@Param("name") String name);
}
