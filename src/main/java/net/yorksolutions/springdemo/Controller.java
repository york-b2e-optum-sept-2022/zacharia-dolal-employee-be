package net.yorksolutions.springdemo;

import net.yorksolutions.springdemo.models.Employee;
import net.yorksolutions.springdemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class Controller {
    private final EmployeeRepository repository;

    @Autowired
    public Controller(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    void addNewEmployee(@RequestBody Employee employee) {
        repository.save(employee);
    }
}
