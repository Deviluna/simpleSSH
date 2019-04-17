package service;

import commons.ServiceResponse;
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

    public void deleteUser(Integer userId) {
        if (null == userId) {
            logger.error("需要删除的主键ID不能为空");
            return;
        }
        userDAO.deleteUserById(userId);
    }

    public void updateUser(UserEntity userEntity) {
        userDAO.updateUser(userEntity);
    }

    public ServiceResponse listUsers(Integer pageNo, Integer pageSize, String username, Boolean type) {
        ServiceResponse sr = new ServiceResponse();
        StringBuilder queryStr = new StringBuilder("from user");
        boolean flag = false;
        if (null != username && username.length() > 0) {
            flag = true;
            queryStr.append(" where username=").append(username);
        }
        if (null != type) {
            if (flag) {
                queryStr.append(" and ");
            } else {
                queryStr.append(" where ");
            }
            queryStr.append(" type=").append(type);
        }
        sr.put("vos", userDAO.listUsers(pageNo, pageSize, queryStr.toString()));
        return sr;
    }
}
