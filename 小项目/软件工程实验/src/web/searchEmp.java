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

@WebServlet(urlPatterns= "/searchEmp")
public class searchEmp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int empno= Integer.parseInt(request.getParameter("EMPNO"));
//        int deptno= Integer.parseInt(request.getParameter("DEPTNO"));
//        int wageno= Integer.parseInt(request.getParameter("WAGENO"));
//        System.out.println(empno+" "+deptno+" "+wageno);
//        empdeptService service=new empdeptServiceImpl();
//        try {
//            int a1=service.selEmpEmpno(empno);
//            int a2=service.selEmpDeptno(deptno);
//            int a3=service.selEmpWageno(wageno);
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
////            if(a1==2)
////                response.getWriter().write("2");
////            else if(a1==1&&a2==4)
////                response.getWriter().write("4");
////            else if(a1==1&a2==3&&a3==6)
////                response.getWriter().write("6");
////            else
////                response.getWriter().write("1");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empno= Integer.parseInt(request.getParameter("EMPNO"));
        int deptno= Integer.parseInt(request.getParameter("DEPTNO"));
        int wageno= Integer.parseInt(request.getParameter("WAGENO"));
        int attenno=Integer.parseInt(request.getParameter("ATTENNO"));
        System.out.println(empno+" "+deptno+" "+wageno+" "+attenno);
        empdeptService service=new empdeptServiceImpl();
        try {
            int a1=service.selEmpEmpno(empno);
            int a2=service.selEmpDeptno(deptno);
            int a3=service.selEmpWageno(wageno);
            int a4=service.selEmpAttenno(attenno);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            if(a1==2)
                response.getWriter().write("2");
            else if(a1==1&&a2==3)
                response.getWriter().write("3");
            else if(a1==1&&a2==4&&a3==6)
                response.getWriter().write("6");
            else if(a1==1&&a2==4&&a3==5&&a4==8)
                response.getWriter().write("8");
            else
                response.getWriter().write("1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
