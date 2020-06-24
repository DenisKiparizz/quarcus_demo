package org.denis.firstApp.controller;

import org.denis.firstApp.dto.UserDto;
import org.denis.firstApp.entity.User;
import org.denis.firstApp.repository.UserRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rest")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserRepository userRepository;

    @GET
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @POST
    @Transactional
    public void add(@Valid User person) {
        userRepository.save(person);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void remove(@PathParam("id") String id) {
        userRepository.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    public User update(@PathParam("id") String id,
                       UserDto userDto) {
        return userRepository.updateUser(id, userDto);
    }

    @GET
    @Path("id/{id}")
    public User getById(@PathParam("id") String id) {
        return userRepository.findByUserId(id);
    }

    @GET
    @Path("/{name}")
    public User getByName(@PathParam("name") String name) {
        return userRepository.findByName(name);
    }

    @GET
    @Path("course/{course}")
    public List<User> getByCourse(@PathParam("course") String course) {
        return userRepository.findByCourse(course);
    }
}
