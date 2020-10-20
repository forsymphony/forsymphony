package web;

import domain.employee;
import org.apache.commons.beanutils.BeanUtils;
import service.empdeptService;
import service.empdeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(urlPatterns = "/html/UpdataEmp")
public class UpdataEmp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String[]> map=request.getParameterMap();
        employee yee=new employee();
        try {
            BeanUtils.populate(yee,map);
            empdeptService service=new empdeptServiceImpl();
            int a=service.updata(yee);
            System.out.println(a);
            System.out.println( request.getContextPath()+"/html/allEmp.html");
            response.sendRedirect(request.getContextPath()+"/html/allEmp.html");
        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
