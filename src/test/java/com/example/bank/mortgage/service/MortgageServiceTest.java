package com.example.bank.mortgage.service;

import com.example.bank.mortgage.controller.MortgageApplicationResponse;
import com.example.bank.mortgage.model.MortgageApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MortgageServiceTest {

    @Test
    void check() {
        MortgageService mortgageService = new MortgageService(null, null, null);

        MortgageApplicationResponse check = mortgageService.check(new MortgageApplication());

        Assertions.assertEquals(ApplicationStatus.SUCCESS, check.getStatus());
    }
}