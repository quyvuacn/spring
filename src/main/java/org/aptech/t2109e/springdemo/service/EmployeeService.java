package org.aptech.t2109e.springdemo.service;

import org.aptech.t2109e.springdemo.entity.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll(Pageable pageable);
    List<Employee> findAll();

    Employee create(Employee employee);
}