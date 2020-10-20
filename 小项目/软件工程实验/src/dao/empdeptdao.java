package dao;

import domain.dept;
import domain.empdept;
import domain.employee;
import domain.employeeS;

import java.sql.SQLException;
import java.util.List;

public interface empdeptdao {
    public abstract List<empdept> findall() throws SQLException;
    public abstract empdept findnomal(String nomalid) throws SQLException;
    public abstract int delEmpByEmpno(int empno) throws SQLException;
    public abstract int selEmpByEmpno(int empno) throws SQLException;
    public abstract int selEmpEmpno(int empno) throws SQLException;
    public abstract int selEmpDeptno(int deptno) throws SQLException;
    public abstract int selEmpWageno(int wageno) throws SQLException;
    public abstract int selEmpAttenno(int attenno) throws SQLException;

    public abstract void addEmp(employee employee) throws SQLException;
    public abstract employeeS findByempno(int empno) throws SQLException;
    public abstract int updata(employee yee) throws SQLException;
}
