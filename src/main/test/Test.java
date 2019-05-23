import com.alibaba.fastjson.JSON;
import commons.ServiceResponse;
import controller.UserController;
import dao.SourceDAO;
import dao.UserInfoDAO;
import entity.*;
import net.bytebuddy.asm.Advice;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.UserDataHandler;
import service.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    private UserInfoDAO userInfoDAO;

    @org.junit.Test
    public void doLogin() {
        UserInfoEntity entity = userInfoDAO.doLogin("admin", "admin");
        System.out.println(JSON.toJSONString(entity));
    }
}