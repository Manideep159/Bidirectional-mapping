package com.example.Organization.Controller;

import com.example.Organization.Entity.Address;
import com.example.Organization.Entity.Employee;
import com.example.Organization.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping("/create")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("/address/{city}")
    public Address findByCity(@PathVariable String city){
        return service.getByCity(city);
    }

}
