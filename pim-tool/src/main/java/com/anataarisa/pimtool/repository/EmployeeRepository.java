package com.anataarisa.pimtool.repository;

import java.util.List;

import com.anataarisa.pimtool.entity.Employee;

public interface EmployeeRepository extends BaseRepository<Employee> {
    public List<Employee> getAll();
    public Employee savEmployee(Employee employee);
}
