package org.aptech.t2109e.springdemo.service.impl;

import org.aptech.t2109e.springdemo.entity.Employee;
import org.aptech.t2109e.springdemo.repository.EmployeeRepoInterface;
import org.aptech.t2109e.springdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployeeServiceImplement implements EmployeeService {
    @Autowired
    EmployeeRepoInterface employeeRepo;

    @Override
    public List<Employee> findAll(Pageable pageable) {
        return employeeRepo.findAll(pageable).getContent();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        return  employeeRepo.save(employee);
    }
}
