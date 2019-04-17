package service;

import dao.ArticleDAO;
import dao.SourceDAO;
import entity.ArticleEntity;
import entity.SourceEntity;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    SourceDAO sourceDAO;
    @Autowired
    ArticleDAO articleDAO;

    public void addArticle(ArticleEntity articleEntity){
        articleDAO.add(articleEntity);
    }

}
