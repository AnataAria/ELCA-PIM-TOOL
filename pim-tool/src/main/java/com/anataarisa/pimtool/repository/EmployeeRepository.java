package com.anataarisa.pimtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anataarisa.pimtool.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Number> {

}
