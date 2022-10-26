package net.yorksolutions.springdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    public String name;
    public String role;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
}
