package service;

import dao.UserDAO;
import entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDAO userDAO;

    public void addUser(UserEntity userEntity) {
        userDAO.addUserEntity(userEntity);
    }

    public void deleteUser(Long userId) {
    }

    public void updateUser() {
    }

    public void listUsers() {
    }
}
