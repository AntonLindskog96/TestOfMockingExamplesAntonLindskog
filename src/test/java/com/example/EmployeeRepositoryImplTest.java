package com.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryImplTest {



    EmployeeRepositoryImpl employeeRespImpl = new EmployeeRepositoryImpl();




    @Test
        public void testFindAll() {
            Employee em1 = new Employee("1", 1200);
            Employee em2 = new Employee("2", 1000);

            employeeRespImpl.save(em1);
            employeeRespImpl.save(em2);

            List<Employee> employees = employeeRespImpl.findAll();

            assertEquals(2, employees.size());
            assertEquals(em1, employees.get(0));
            assertEquals(em2, employees.get(1));
        }
//        var employee = new Employee ("Tester1", 1200    );
//        var employeeResp = Mockito.mock(EmployeeRepositoryImpl.class);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee);


    }
