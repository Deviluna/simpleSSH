package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PersonInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        if(request.getSession().getAttribute("username")==null||request.getSession().getAttribute("username").equals("")) {
            response.sendRedirect("/index.jsp");
            return false;
        }
        else
            return true;
    }
}
