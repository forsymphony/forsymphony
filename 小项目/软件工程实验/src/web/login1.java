package web;

import domain.userlogin;
import domain.userlogin2;
import service.userloginService;
import service.userloginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login1")
public class login1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        System.out.println("传入的参数为："+id+" "+password);
        userloginService service=new userloginServiceImpl();
        userlogin2 user2=new userlogin2();


        try {
            user2 = service.findnomal(id);
            System.out.println(user2);
            if(user2==null)
                response.getWriter().write("0");
             else if (user2.getNPASSWORD().equals(password))
                response.getWriter().write("1");
            else if (!user2.getNPASSWORD().equals(password))
                response.getWriter().write("2");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
