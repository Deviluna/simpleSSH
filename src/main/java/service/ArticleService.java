package service;

import commons.ServiceResponse;
import dao.ArticleDAO;
import entity.ArticleEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private Logger logger = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    private ArticleDAO articleDAO;

    public void addArticle(ArticleEntity userEntity) {
        articleDAO.add(userEntity);
    }

    public void deleteArticle(Integer articleId) {
        if (null == articleId) {
            logger.error("需要删除的主键ID不能为空");
            return;
        }
        articleDAO.delete(articleId);
    }

    public void updateArticle(ArticleEntity userEntity) {
        articleDAO.update(userEntity);
    }

    public ServiceResponse listArticles(String sid) {
        ServiceResponse sr = new ServiceResponse();
        StringBuilder queryStr = new StringBuilder("from user");
        queryStr.append(" where sid=").append(sid);
        sr.put("vos", articleDAO.list(queryStr.toString()));
        return sr;
    }
}
