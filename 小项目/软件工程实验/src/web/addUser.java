package web;

import com.fasterxml.jackson.databind.util.BeanUtil;
import domain.adduser;
import org.apache.commons.beanutils.BeanUtils;
import service.userloginService;
import service.userloginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(urlPatterns = "/html/addUser")
public class addUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String[]> map=request.getParameterMap();
        domain.adduser user=new domain.adduser();
        try {
            BeanUtils.populate(user,map);
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        userloginService service=new userloginServiceImpl();
//        System.out.println(user);
        try {
            service.adduser(user);
            System.out.println(request.getContextPath()+"/html/login.html");
            response.sendRedirect(request.getContextPath()+"/html/login.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
