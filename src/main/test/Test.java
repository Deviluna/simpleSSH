import com.alibaba.fastjson.JSON;
import commons.ServiceResponse;
import controller.UserController;
import entity.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    UserService userService;
    @Autowired
    TestService testService;

    @org.junit.Test
    public void addArticle(){
        ArticleEntity articleEntity=new ArticleEntity();
        articleEntity.setImage_url("fdafds");
        articleEntity.setContent_url("fdsafdsafdsafds");
        articleEntity.setTitle("title");
        articleEntity.setSid(0);
        testService.addArticle(articleEntity);
    }

    @org.junit.Test
    public void doLogin(){
        Boolean bool=userService.doLogin("wu","wu1234");
        System.out.println(bool);
    }


    @org.junit.Test
    public void test(){
        UserEntity userEntity=new UserEntity();
        userEntity.setUsername("wu");
        userEntity.setPassword("wu1234");
        userEntity.setType(false);
        System.out.println(userEntity);
        userService.addUser(userEntity);
    }

    @org.junit.Test
    public void testGetUser() {
        ServiceResponse sr = userService.listUsers(1, 10, "wu", null);
        System.out.print(JSON.toJSONString(sr));
    }

}