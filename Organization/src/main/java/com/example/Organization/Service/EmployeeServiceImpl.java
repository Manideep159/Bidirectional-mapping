package com.example.Organization.Service;


import com.example.Organization.Entity.Employee;
import com.example.Organization.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee){
      return   employeeRepository.save(employee);
    }
    @Override
    public Employee getById(int id){
        return employeeRepository.findById(id);
    }
}
