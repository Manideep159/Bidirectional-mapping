package com.example.Organization.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    private  int houseNo;
    private String street;
    private String city;

}
