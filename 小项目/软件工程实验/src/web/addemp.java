package web;

import domain.dept;
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

@WebServlet(urlPatterns = "/html/addemp")
public class addemp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String[]> map=request.getParameterMap();
        employee employee=new employee();
        try {
            BeanUtils.populate(employee,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        empdeptService service=new empdeptServiceImpl();
        try {
            service.addEmp(employee);

            response.sendRedirect(request.getContextPath()+"/html/allEmp.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
