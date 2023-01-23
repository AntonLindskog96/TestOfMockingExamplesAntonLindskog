package com.example;

import java.util.List;

public class BankServiceImpl implements BankService {
    private boolean payCalled = false;
    private int payCalledCount = 0;
    private String payId = "";
    private double payAmount = 0.0;

    public void pay(String id, double amount) {
        payCalled = true;
        payCalledCount++;
        payId = id;
        payAmount = amount;
    }

    public boolean isPayCalled() {
        return payCalled;
    }

    public int getPayCalledCount() {
        return payCalledCount;
    }

    public String getPayId() {
        return payId;
    }

    public double getPayAmount() {
        return payAmount;
    }

    }