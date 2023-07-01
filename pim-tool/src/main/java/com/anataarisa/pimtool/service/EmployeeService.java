package com.anataarisa.pimtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.anataarisa.pimtool.entity.Employee;
import com.anataarisa.pimtool.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    
    public Employee getEmployeeById(Number id) {
        return employeeRepository.getReferenceById(id);
    }
}
