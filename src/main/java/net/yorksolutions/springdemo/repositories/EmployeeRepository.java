package net.yorksolutions.springdemo.repositories;

import net.yorksolutions.springdemo.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
