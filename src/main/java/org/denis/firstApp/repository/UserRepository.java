package org.denis.firstApp.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.denis.firstApp.dto.UserDto;
import org.denis.firstApp.entity.User;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepositoryBase<User, String> {

    public List<User> getAll() {
        return listAll();
    }

    public User findByName(String name) {
        return find("userName", name).firstResult();
    }

    public User findByUserId(String id) {
        return findById(id);
    }

    public void save(User user) {
        persist(user);
    }

    public User updateUser(String id, UserDto userDto) {
        User user = findById(id);
        user.setUserName(userDto.getName());
        user.setCourses(List.of(userDto.getCourse()));
        update(user);
        return user;

    }

    public List<User> findByCourse(String courseName) {
        return findAll()
                .stream()
                .filter(n -> !n.getCoursesByName(courseName).isEmpty())
                .collect(Collectors.toList());
    }
}