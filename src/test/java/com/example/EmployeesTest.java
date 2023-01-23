package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;

class EmployeesTest {
    BankService bankService = Mockito.mock(BankService.class);
    EmployeeRepositoryImpl employeeRespImpl = new EmployeeRepositoryImpl();

    @Test
    void payEmployees() {
        var employees = new Employees(employeeRespImpl, bankService);
        var e1 = new Employee("Test1", 1200);
        var e2 = new Employee("Test2", 1000);
        var e3 = new Employee("Test3", 1700);


        employeeRespImpl.save(e1);
        employeeRespImpl.save(e2);
        employeeRespImpl.save(e3);

        assertThat(employees.payEmployees()).isEqualTo(3);


    }

    @Test
    void payEmployeesError() {
        Employee e1 = new Employee("1", 1000.0);
        Employee e2 = new Employee("2", 2000.0);
        employeeRespImpl.save(e1);
        employeeRespImpl.save(e2);

        Employees employees = new Employees(employeeRespImpl, bankService);
        doThrow(new RuntimeException()).when(bankService).pay(e2.getId(), e2.getSalary());


        int payments = employees.payEmployees();
        assertTrue(e1.isPaid());
        assertFalse(e2.isPaid());

    }
}
