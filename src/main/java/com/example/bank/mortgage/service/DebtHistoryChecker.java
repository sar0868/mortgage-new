package com.example.bank.mortgage.service;

import com.example.bank.mortgage.model.MortgageApplication;
import org.springframework.stereotype.Service;

@Service
public class DebtHistoryChecker implements Checker {


    @Override
    public ApplicationStatus check(MortgageApplication application) {
        return ApplicationStatus.SUCCESS;
    }
}
