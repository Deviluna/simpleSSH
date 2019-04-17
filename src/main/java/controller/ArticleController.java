package controller;

import commons.ServiceResponse;
import entity.ArticleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.ArticleService;

@Controller
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse addNewUser(ArticleEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        articleService.addArticle(userEntity);
        return sr;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServiceResponse updateUser(ArticleEntity userEntity) {
        ServiceResponse sr = new ServiceResponse();
        articleService.updateArticle(userEntity);
        return sr;
    }

    @RequestMapping(value = "/delete")
    public ServiceResponse deleteUser(@RequestParam Integer articleId) {
        ServiceResponse sr = new ServiceResponse();
        articleService.deleteArticle(articleId);
        return sr;
    }

    @RequestMapping(value = "/list")
    public ServiceResponse list(@RequestParam(required = true) String sid) {
        ServiceResponse sr =  articleService.listArticles(sid);
        return sr;
    }
}
