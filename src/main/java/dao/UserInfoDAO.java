package dao;

import com.sun.istack.internal.NotNull;
import entity.UserInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class UserInfoDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public UserInfoEntity doLogin(String username, String password) {
        Query query = getSession().createQuery(" from entity.UserInfoEntity where name=?1 and password=?2").setParameter(1, username).setParameter(2, password);
        if(query.getResultList().size()>0)
            return (UserInfoEntity) query.getResultList().get(0);
        else
            return null;
    }

    public void add(UserInfoEntity entity) {
        getSession().save(entity);
    }

    public void update(UserInfoEntity entity) {
        getSession().update(entity);
    }

    public void delete(UserInfoEntity entity) {
        getSession().delete(entity);
    }

    public List<UserInfoEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
