package dao;

import entity.TeaPicEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class TeaPicDao {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(TeaPicEntity teaPicEntity) {
        this.getSession().save(teaPicEntity);
    }

    public void delete(TeaPicEntity teaPicEntity) {
        this.getSession().delete(teaPicEntity);
    }

    public List<TeaPicEntity> list(Integer sid) {
        Query query = getSession().createQuery("from tea_pic where sid=?1").setParameter(1, sid);
        return query.list();
    }
}
