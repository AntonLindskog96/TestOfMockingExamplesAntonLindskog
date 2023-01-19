package com.example;

import java.util.List;

public class BankServiceImpl implements BankService {
    EmployeeRepositoryImpl employeeRepository;
    List<Employee> employees = employeeRepository.findAll();

    @Override
    public void pay(String id, double amount) {
        var employeePay = employees.stream().filter()

    }

}
