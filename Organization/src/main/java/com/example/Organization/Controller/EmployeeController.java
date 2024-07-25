package com.example.Organization.Controller;

import com.example.Organization.Entity.Employee;
import com.example.Organization.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping("/create")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }
    @GetMapping("/getList/{id}")
    public Employee findEmployee(@Pathvariable int id){
        return service.getById(id);
    }

}
