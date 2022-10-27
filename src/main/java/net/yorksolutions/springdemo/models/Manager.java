package net.yorksolutions.springdemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    public String name;

    @OneToMany
    public Set<Employee> reports;

    public Manager(String name) {
        this.name = name;
    }

    public Manager() {
    }

    // Set - just like a list, except no duplicates are allowed
    // [ 1, 2, 3 ] is a set
    // [ 1, 2, 1 ] not a set
}
