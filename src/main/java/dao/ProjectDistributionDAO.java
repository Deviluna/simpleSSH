package dao;

import com.sun.istack.internal.NotNull;
import entity.ProjectDistributionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class ProjectDistributionDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(ProjectDistributionEntity entity) {
        getSession().save(entity);
    }

    public void update(ProjectDistributionEntity entity) {
        getSession().update(entity);
    }

    public void delete(ProjectDistributionEntity entity) {
        getSession().delete(entity);
    }

    public List<ProjectDistributionEntity> list(Integer pageNo, @NotNull Integer pageSize, @NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        query.setFirstResult(null == pageNo ? 0 : pageNo * pageSize - 1);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
