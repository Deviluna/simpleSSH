package dao;

import com.sun.istack.internal.NotNull;
import entity.RewordTeacherEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class RewordTeacherDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(RewordTeacherEntity entity) {
        getSession().save(entity);
    }

    public void update(RewordTeacherEntity entity) {
        getSession().update(entity);
    }

    public void delete(RewordTeacherEntity entity) {
        getSession().delete(entity);
    }

    public List<RewordTeacherEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
