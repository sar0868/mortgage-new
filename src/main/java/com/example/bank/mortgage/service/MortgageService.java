package com.example.bank.mortgage.service;

import com.example.bank.mortgage.controller.MortgageApplicationResponse;
import com.example.bank.mortgage.model.MortgageApplication;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.stereotype.Service;

@Service
public class MortgageService {

    private ComplianceChecker complianceChecker;
    private Checker financeChecker;
    private DebtHistoryChecker debtHistoryChecker;


    public MortgageService(ComplianceChecker complianceChecker, Checker financeChecker, DebtHistoryChecker debtHistoryChecker) {
        this.complianceChecker = complianceChecker;
        this.financeChecker = financeChecker;
        this.debtHistoryChecker = debtHistoryChecker;
    }

    public MortgageApplicationResponse check(MortgageApplication mortgageApplication) {

        MortgageApplicationResponse mortgageApplicationResponse = new MortgageApplicationResponse();
        mortgageApplicationResponse.setStatus(ApplicationStatus.SUCCESS);
        return mortgageApplicationResponse;
    }
}
