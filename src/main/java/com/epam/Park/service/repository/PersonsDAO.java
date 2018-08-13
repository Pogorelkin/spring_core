package com.epam.Park.service.repository;

import com.epam.Park.service.entitiesDto.Person;

import java.util.ArrayList;
import java.util.List;

public interface PersonsDAO {
    List<Person> persons = new ArrayList<>();

    void addPerson(Person person);

    void editPerson(int id, Person person);

    void deletePerson(int Id);


}
