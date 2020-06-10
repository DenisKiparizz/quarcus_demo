package org.denis.firstApp.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.denis.firstApp.dto.PersonDto;
import org.denis.firstApp.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
    public Person getById(Long id) {
        return findById(id);
    }

    public List<Person> getAll() {
        return findAll().list();
    }

    public void save(Person person) {
        person.persist();
    }

    public void remove(Long id) {
        Person person = findById(id);
        person.delete();
    }

    public void update(Long id, PersonDto personDto) {
        Person person = findById(id);
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setAge(personDto.getAge());
    }

}
