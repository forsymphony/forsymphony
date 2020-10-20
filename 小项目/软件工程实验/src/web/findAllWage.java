package web;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.AllWage;
import service.wageService;
import service.wageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/findAllWage")
public class findAllWage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int attenno=Integer.parseInt(request.getParameter("attenno"));
        int wageno=Integer.parseInt(request.getParameter("wageno"));
        AllWage wage=new AllWage();
        wageService sevice=new wageServiceImpl();
        try {
            wage=sevice.findAllWage(attenno,wageno);
//            System.out.println("1这是servlet的："+wage);
            ObjectMapper ob=new ObjectMapper();
            String a=ob.writeValueAsString(wage);
//            System.out.println("2这是servlet的："+a);
            response.getWriter().write(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
