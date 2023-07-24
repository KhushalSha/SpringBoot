package com.example.spring2jpa;
import org.springframework.data.repository.CrudRepository;



public interface Crud extends CrudRepository<Database,Integer> {
    
}
