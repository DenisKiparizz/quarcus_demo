package org.denis.firstApp.controller;

import org.denis.firstApp.dto.PersonDto;
import org.denis.firstApp.entity.Person;
import org.denis.firstApp.repository.PersonRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rest")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> getAll() {
        return personRepository.getAll();
    }

    @GET
    @Path("/{id}")
    public Person getById(@PathParam("id") Long id) {
        return personRepository.getById(id);
    }

    @POST
    @Transactional
    public void add(@Valid Person person) {
        personRepository.save(person);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void remove(@PathParam("id") Long id) {
        personRepository.remove(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void update(@PathParam("id") Long id,
                       @Valid PersonDto personDto) {
        personRepository.update(id, personDto);
    }
}
