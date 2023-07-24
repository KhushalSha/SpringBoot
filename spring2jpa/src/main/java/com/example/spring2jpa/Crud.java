package com.example.spring2jpa;
import org.springframework.data.repository.CrudRepository;
import com.example.spring2jpa.Employee;


public interface Crud extends CrudRepository<Employee,Integer> {
    
}
