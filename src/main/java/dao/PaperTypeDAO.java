package dao;

import com.sun.istack.internal.NotNull;
import entity.PaperTypeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Transactional
@Repository
public class PaperTypeDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(PaperTypeEntity entity) {
        getSession().save(entity);
    }

    public void update(PaperTypeEntity entity) {
        getSession().update(entity);
    }

    public void delete(PaperTypeEntity entity) {
        getSession().delete(entity);
    }

    public List<PaperTypeEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
