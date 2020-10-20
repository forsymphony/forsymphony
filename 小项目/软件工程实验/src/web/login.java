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

@WebServlet(urlPatterns= "/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        String password=request.getParameter("password");
        userloginService service=new userloginServiceImpl();
        userlogin user=new userlogin();

        try {
            user = service.findroot(id);
            if(user==null)
                response.getWriter().write("0");
             else if (user.getRPASSWORD().equals(password))
                response.getWriter().write("1");
            else if (!user.getRPASSWORD().equals(password))
                response.getWriter().write("2");
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
