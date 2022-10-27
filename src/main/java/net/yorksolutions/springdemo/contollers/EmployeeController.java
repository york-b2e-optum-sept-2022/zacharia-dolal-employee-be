package net.yorksolutions.springdemo.contollers;

import net.yorksolutions.springdemo.models.Employee;
import net.yorksolutions.springdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService service;

    // Bean - dependency that is available to be injected
    //      - an instance (an object) that is created/managed by spring
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    void addNewEmployee(@RequestBody Employee employee) {
        service.addNewEmployee(employee);
    }
}
