package net.yorksolutions.springdemo.repositories;

import net.yorksolutions.springdemo.models.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
