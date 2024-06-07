package com.wanyua.Samfood.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
