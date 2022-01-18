package com.example.demoSpring.dao;
import com.example.demoSpring.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    //Insert - POST Req
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    //Retrieve - GET Req
    List<Person> selectAllPersons();

    //Select
    Optional<Person> selectPersonById(UUID id);

    //Delete
    int DeletePersonById(UUID id);

    //Update
    int UpdatePersonById(UUID id, Person person);
}
