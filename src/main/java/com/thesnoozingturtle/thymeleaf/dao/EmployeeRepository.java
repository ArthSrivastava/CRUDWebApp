package com.thesnoozingturtle.thymeleaf.dao;

import com.thesnoozingturtle.thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //add a method to sort the data by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
