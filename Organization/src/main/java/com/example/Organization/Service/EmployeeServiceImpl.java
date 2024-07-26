package com.example.Organization.Service;


import com.example.Organization.Entity.Address;
import com.example.Organization.Entity.Employee;
import com.example.Organization.Repository.AddressRepository;
import com.example.Organization.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepo;
    private

    @Override
    public Employee saveEmployee(Employee employee){

        return   employeeRepository.save(employee);
    }

    @Override
    public Address getByCity(String city) {

        return addressRepo.findByCity(city);
    }

    public List<Employee> saveAllEmployee(List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }

//    @Override
//    public Employee getById(int id)
//    {
//        return employeeRepository.findById(id);
//    }
}
