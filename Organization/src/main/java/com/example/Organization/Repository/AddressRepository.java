package com.example.Organization.Repository;

import com.example.Organization.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    Address findByCity(String city);
}
