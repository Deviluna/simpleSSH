package dao;

import com.sun.istack.internal.NotNull;
import entity.ArticleEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository
public class ArticleDAO {
    @Resource
    SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(ArticleEntity articleEntity){
        getSession().save(articleEntity);
    }

    public void update(ArticleEntity userEntity) {
        getSession().update(userEntity);
    }

    public void delete(Integer id) {
        ArticleEntity userEntity = new ArticleEntity();
        userEntity.setId(id);
        getSession().delete(userEntity);
    }

    public List<ArticleEntity> list(@NotNull String queryStr) {
        Query query = getSession().createQuery(queryStr);
        return query.list();
    }

}
