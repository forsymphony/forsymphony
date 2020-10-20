package service;

import dao.empdeptdao;
import dao.empdeptdaoImpl;
import domain.dept;
import domain.empdept;
import domain.employee;
import domain.employeeS;

import java.sql.SQLException;
import java.util.List;

public class empdeptServiceImpl implements empdeptService {
    empdeptdao dao=new empdeptdaoImpl();
    @Override
    public List<empdept> findall() throws SQLException {
        List<empdept> list=dao.findall();
        return list;
    }

    @Override
    public empdept findnomal(String nomalid) throws SQLException {
        empdept emp=dao.findnomal(nomalid);
//        System.out.println("service中的emp:"+emp);
        return emp;
    }

    @Override
    public int delEmpByEmpno(int empno) throws SQLException {
        int a=dao.delEmpByEmpno(empno) ;
//        System.out.println("这是Service的值："+a);
        return a;
    }

    @Override
    public int selEmpByEmpno(int empno) throws SQLException {
        return dao.selEmpByEmpno(empno);

    }

    @Override
    public int selEmpEmpno(int empno) throws SQLException {
        int a=dao.selEmpEmpno(empno);
        System.out.println("这是selempempno的："+a);
        return a;
    }

    @Override
    public int selEmpDeptno(int deptno) throws SQLException {
        int a=dao.selEmpDeptno(deptno);
        System.out.println("这是selempedptno的："+a);
        return a;
    }

    @Override
    public int selEmpWageno(int wageno) throws SQLException {
        int a=dao.selEmpWageno(wageno);
        System.out.println("这是selempwageno的："+a);
        return a;
    }

    @Override
    public int selEmpAttenno(int attenno) throws SQLException {
        int a=dao.selEmpAttenno(attenno);
        System.out.println("这是selEmpAttenno的："+a);
        return a;
    }



    @Override
    public void addEmp(employee employee) throws SQLException {
        dao.addEmp(employee);
    }

    @Override
    public employeeS findByempno(int empno) throws SQLException {
        employeeS empS=dao.findByempno(empno);
        System.out.println("这是Servlet:"+empS);
        return empS;
    }

    @Override
    public int updata(employee yee) throws SQLException {
        return dao.updata(yee);
    }

}
