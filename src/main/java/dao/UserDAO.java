package dao;
import com.sun.istack.internal.NotNull;
import entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
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

    public Boolean doLogin(String username,String password){
        Query query=getSession().createQuery("from entity.UserEntity where username=?1 and password=?2").setParameter(1,username).setParameter(2,password);
        if(query.getResultList().size()>0)
            return true;
        else
            return false;
    }

    public void updateUser(UserEntity userEntity) {
        getSession().update(userEntity);
    }

    public void deleteUserById(Integer id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        getSession().delete(userEntity);
    }

    public List<UserEntity> listUsers(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
//        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
//        query.setMaxResults(pageSize);
        return query.getResultList();
    }
}
