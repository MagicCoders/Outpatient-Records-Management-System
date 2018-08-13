package com.test.records.crud;

import com.test.records.models.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    public UserRepository userRepository;

    public User findUser(String staffID, String password) {
        User user = userRepository.findByStaffId(staffID);
        if ((user != null) && user.getPassword().equals(password)) {
            return user;
        }

        User dummyUser = new User("1234", "Dummy User", "L1234", "dummy@mail.com", "Doctor","male", "dummy1234");
        return dummyUser;
    }

    public Object createUser(User user){
        return this.userRepository.save(user);
    }
}
