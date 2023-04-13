package com.example.demo.DataModel;
import org.springframework.data.repository.CrudRepository;


public interface DataRepo extends CrudRepository<Viajes, Long> {
    
}