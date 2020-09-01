package com.example.bank.mortgage.service;

import com.example.bank.mortgage.model.MortgageApplication;

public interface Checker {
    ApplicationStatus check(MortgageApplication application);
}
