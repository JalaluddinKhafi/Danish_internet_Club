package com.dahishclub.danish_internet_club.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {


    @Id
    private Long id;
    String fullname;
    String username;
    String password;
    String email;
    String phone;
    String address;

}
