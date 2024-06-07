package com.wanyua.Samfood.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wanyua.Samfood.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;

    private USER_ROLE role;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto> favorites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // if  you delete a user, it deletes all associated addresses
    private List<Addresses> addresses = new ArrayList<>();



}
