package dao;

import com.sun.istack.internal.NotNull;
import entity.SourceEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class SourceDAO {

    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    public void add(SourceEntity sourceEntity){
        getSession().save(sourceEntity);
    }

    public void update(SourceEntity userEntity) {
        getSession().update(userEntity);
    }

    public void delete(Integer id) {
        SourceEntity userEntity = new SourceEntity();
        userEntity.setId(id);
        getSession().delete(userEntity);
    }

    public List<SourceEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
