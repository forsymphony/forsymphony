package web;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.empdept;
import service.empdeptService;
import service.empdeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/findnomalid")
public class findNomalId extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String nomalid=request.getParameter("nomalid");
            System.out.println(nomalid);
            empdeptService service=new empdeptServiceImpl();
            empdept empdept=new empdept();
        try {
            empdept=service.findnomal(nomalid);
            ObjectMapper mp=new ObjectMapper();
            String a=mp.writeValueAsString(empdept);
            response.getWriter().write(a);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
