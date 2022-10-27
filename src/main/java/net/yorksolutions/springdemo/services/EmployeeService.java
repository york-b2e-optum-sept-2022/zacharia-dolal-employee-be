package net.yorksolutions.springdemo.services;

import net.yorksolutions.springdemo.models.Employee;
import net.yorksolutions.springdemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void addNewEmployee(Employee employee) {
        repository.save(employee);
    }

    public Iterable<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getById(Long id) {
        // null - references no object
        // null Reference Exception
        // Optional - to make it easy to write null safe code
        return repository.findById(id);
    }
}
