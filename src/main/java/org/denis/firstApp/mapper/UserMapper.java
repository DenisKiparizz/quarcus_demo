package org.denis.firstApp.mapper;

import org.denis.firstApp.dto.UserDto;
import org.denis.firstApp.entity.User;
import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class UserMapper {

    public User mapToUser(UserDto userDto) {
        User user = new User();
        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        user.setUserName(userDto.getName());
        user.setCourses(userDto.getCourse());
        return user;
    }
}
