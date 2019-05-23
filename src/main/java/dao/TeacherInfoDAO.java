package dao;

import com.sun.istack.internal.NotNull;
import entity.TeacherInfoEntity;
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
public class TeacherInfoDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public TeacherInfoEntity getById(int id) {
        Query query = getSession().createQuery("from entity.UserInfoEntity where teachWorkId=?1").setParameter(1, id);
        if(query.getResultList().size()>0)
            return (TeacherInfoEntity) query.getResultList().get(0);
        else
            return null;
    }

    public void add(TeacherInfoEntity entity) {
        getSession().save(entity);
    }

    public void update(TeacherInfoEntity entity) {
        getSession().update(entity);
    }

    public void delete(TeacherInfoEntity entity) {
        getSession().delete(entity);
    }

    public List<TeacherInfoEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
