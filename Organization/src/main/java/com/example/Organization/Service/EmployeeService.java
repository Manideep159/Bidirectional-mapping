package com.example.Organization.Service;


import com.example.Organization.Entity.Address;
import com.example.Organization.Entity.Employee;

public interface EmployeeService {

    public  Employee saveEmployee(Employee employee);
    public Address getByCity(String city);

    }

//     public Employee findById(int id);


