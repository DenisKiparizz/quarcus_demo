package org.denis.firstApp.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.denis.firstApp.dto.UserDto;
import org.denis.firstApp.entity.CoursesEnum;
import org.denis.firstApp.entity.User;
import org.denis.firstApp.mapper.UserMapper;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserRepository implements PanacheMongoRepositoryBase<User, String> {

    @Inject
    UserMapper userMapper;

    public List<User> getAll() {
        return listAll();
    }

    public User findByName(String name) {
        return find("userName", name).firstResult();
    }

    public User findByUserId(String id) {
        return findById(id);
    }

    public void save(UserDto user) {
        persist(userMapper.mapToUser(user));
    }

    public User updateUser(String id, UserDto userDto) {
        User user = findById(id);
        user.setUserName(userDto.getName());
        user.setCourses(userDto.getCourse());
        update(user);
        return user;
    }

    public List<User> findByCourse(CoursesEnum courseName) {
        return findAll()
                .stream()
                .filter(n -> !n.getCoursesByName(courseName).isEmpty())
                .collect(Collectors.toList());
    }
}