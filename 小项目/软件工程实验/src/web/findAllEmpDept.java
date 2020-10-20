package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.empdept;
import service.empdeptService;
import service.empdeptServiceImpl;

@WebServlet(urlPatterns = "/findAllEmpDept")
public class findAllEmpDept extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        empdeptService serivce=new empdeptServiceImpl();
        try {
            List<empdept> list=serivce.findall();
            ObjectMapper ob=new ObjectMapper();
            String json=ob.writeValueAsString(list);
            response.getWriter().write(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
