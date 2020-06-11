package org.denis.firstApp.mapper;

import org.denis.firstApp.dto.PersonDto;
import org.denis.firstApp.entity.Person;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonMapper {

    public Person mapToPerson(PersonDto dto) {
        Person person = new Person();
        person.setFirstName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setAge(dto.getAge());
        return person;
    }

}
