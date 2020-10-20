package web;

import service.empdeptService;
import service.empdeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/delemp")
public class delemp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empno=Integer.parseInt(request.getParameter("empno"));
//        System.out.println("这是servlrt的empno："+empno);
        empdeptService service=new empdeptServiceImpl();
        try {
            int a=service.delEmpByEmpno(empno);
//            System.out.println("这是servlrt的a："+a);
            if(a==1)
                response.getWriter().write("1");
            else
                response.getWriter().write("0");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
