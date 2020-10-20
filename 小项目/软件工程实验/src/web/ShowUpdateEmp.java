package web;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.employee;
import domain.employeeS;
import service.empdeptService;
import service.empdeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/ShowUpdateEmp")
public class ShowUpdateEmp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int empno=Integer.parseInt(request.getParameter("empno"));
//        System.out.println(empno);
//        employee oyee=new employee();
//        empdeptService service=new empdeptServiceImpl();
//        try {
//            oyee=service.findByempno(empno);
//            System.out.println("这是post的oyee:"+oyee);
//            ObjectMapper mp=new ObjectMapper();
//            String json=mp.writeValueAsString(oyee);
//            response.getWriter().write(json);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int empno=Integer.parseInt(request.getParameter("empno"));
            System.out.println(empno);
            employeeS oyee=new employeeS();
            empdeptService service=new empdeptServiceImpl();
        try {
            oyee=service.findByempno(empno);
//            System.out.println("这是oyee:"+oyee);
            ObjectMapper mp=new ObjectMapper();
            String json=mp.writeValueAsString(oyee);
//            System.out.println("这是json:"+json);
            response.getWriter().write(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
