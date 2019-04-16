package dao;
import entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.*;
@Transactional
@Repository
public class UserDAO {

    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addUserEntity(UserEntity userEntity){
        getSession().save(userEntity);
    }

}
