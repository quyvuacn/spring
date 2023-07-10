package org.aptech.t2109e.springdemo.repository;

import org.aptech.t2109e.springdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepoInterface extends JpaRepository<Employee, Long>, JpaSpecificationExecutor {
}