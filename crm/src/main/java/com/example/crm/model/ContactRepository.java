
package com.example.crm.model;



import org.springframework.data.repository.CrudRepository;

// pasa modelo y tipo de dato del id 
public interface ContactRepository extends CrudRepository<Contact, Long> {

}