package com.thesnoozingturtle.thymeleaf.service;

import com.thesnoozingturtle.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
