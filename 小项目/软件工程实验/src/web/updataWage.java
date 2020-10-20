package web;

import service.wageService;
import service.wageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/html/updataWage")
public class updataWage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int attenno= Integer.parseInt(request.getParameter("ATTENNO"));
        int wageno=Integer.parseInt(request.getParameter("WAGENO"));
        String ename=request.getParameter("ENAME");
        System.out.println(ename);
        int day= Integer.parseInt(request.getParameter("DAY"));
        int late= Integer.parseInt(request.getParameter("LATE"));
        int vacate= Integer.parseInt(request.getParameter("VACATE"));
        double real_WAGE= Double.parseDouble(request.getParameter("real_WAGE"));
        double base_WAGE= Double.parseDouble(request.getParameter("base_WAGE"));
        System.out.println(real_WAGE);
        wageService service=new wageServiceImpl();
        try {
//            <a href='wageShow.html?wageno="+element.wageno+"&attenno="+element.attenno+"&ename="+element.ename+"'
            service.updataAttedance(attenno,day,late,vacate);
            service.updataWage(wageno,real_WAGE,base_WAGE);
//            System.out.println(request.getContextPath());
            response.sendRedirect(request.getContextPath()+"/html/wageShow.html?"+"wageno="+wageno+"&attenno="+attenno+"&ename="+ URLEncoder.encode(ename, "UTF-8"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
