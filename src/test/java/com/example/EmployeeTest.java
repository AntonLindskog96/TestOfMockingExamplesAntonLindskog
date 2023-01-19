package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employeetest = new Employee("Tester", 100);


    @Test
    void getId() {

        var ID = employeetest.getId();
        assertThat(ID).isEqualTo("Tester");
    }

    @Test
    void setId() {
        var newId = "NewTestId";
        employeetest.setId(newId);
        assertThat(employeetest.getId()).isEqualTo(newId);
    }

    @Test
    void CheckifSalaryReturnsCorrectNumber() {
            employeetest.getSalary();
            var expected = 100;
            var actual = employeetest.getSalary();
            assertEquals(expected, actual);
        }


    @Test
    void CheckifNewSalaryIsCorrect() {
        var newSalary = employeetest.getSalary() *2;
        employeetest.setSalary(newSalary);
        assertThat(employeetest.getSalary()).isEqualTo(newSalary);
    }

    @Test
    void checkIfEmployeeIsGettingPaid() {

        assertThat(employeetest.isPaid()).isFalse();
    }

    @Test
    void checkIfEmployeeGetPaid() {
        employeetest.setPaid(true);
        assertThat(employeetest.isPaid()).isEqualTo(true);
    }

    @Test
    void checkIfStringOutputIsCorrect() {
        String expected = "Employee [id=Tester, salary=100.0]";
        String actual = employeetest.toString();
        assertEquals(expected, actual);
            }
        }