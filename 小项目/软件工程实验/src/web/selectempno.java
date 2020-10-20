package web;

import domain.empdept;
import domain.userlogin;
import domain.userlogin2;
import service.empdeptService;
import service.empdeptServiceImpl;
import service.userloginService;
import service.userloginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/selectempno")
public class selectempno extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empno=Integer.parseInt(request.getParameter("empno"));
        empdeptService service=new empdeptServiceImpl();
        empdept emp=new empdept();
        try {
            int a=service.selEmpByEmpno(empno);
            if(a==1)
                response.getWriter().write("1");
            else if(a==2)
                response.getWriter().write("2");
            else
                response.getWriter().write("3");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
