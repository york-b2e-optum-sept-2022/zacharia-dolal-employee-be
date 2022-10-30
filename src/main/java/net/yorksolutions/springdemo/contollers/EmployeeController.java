package net.yorksolutions.springdemo.contollers;

import net.yorksolutions.springdemo.models.Employee;
import net.yorksolutions.springdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin
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

    @GetMapping
    Iterable<Employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    Employee getById(@PathVariable Long id) {
        return service
                .getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    static class Message {
        public String message;

        Message(String message) {

            this.message = message;
        }
    }

    @DeleteMapping("/{id}")
    Message deleteById(@PathVariable Long id) {
        return new Message(service.deleteById(id) ? "Success" : "Fail");
    }


    @PutMapping("/{id}")
    Message UpdateById(@PathVariable Long id, @RequestBody Employee employee) {
        return new Message(service.updateById(id, employee) ? "success" : "fail");
    }

}
