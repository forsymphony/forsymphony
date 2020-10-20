package dao;

import domain.*;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.C3POUtilsXML;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class empdeptdaoImpl implements empdeptdao
{
    QueryRunner qr=new QueryRunner(C3POUtilsXML.getDataSource());
    @Override
    public List<empdept> findall() throws SQLException {
        List<empdept> list = new ArrayList<>();
        String sql="SELECT e.EMPNO,e.WAGENO,e.ATTENNO,e.ENAME,e.GENDER,e.TEL,e.EMAIL,e.ADDRESS,d.DEPTNAME  FROM dept d,employee e WHERE d.DEPTNO = e.DEPTNO;";
        list= qr.query(sql,new BeanListHandler<>(empdept.class));
        return list;
    }

    @Override
    public empdept findnomal(String nomalid) throws SQLException {
        System.out.println("进入了findnomal");
        empdept nomal=new empdept();
        String sql="SELECT e.EMPNO,e.WAGENO,e.ATTENNO,e.ENAME,e.GENDER,e.TEL,e.EMAIL,e.ADDRESS,d.DEPTNAME FROM nomaluser n,dept d,employee e WHERE n.EMPNO=e.EMPNO and d.DEPTNO = e.DEPTNO and n.NOMALID=?;";
        nomal=qr.query(sql,new BeanHandler<>(empdept.class),nomalid);
        System.out.println("dao中的nomal:"+nomal);
        return nomal;
    }

    @Override
    public int delEmpByEmpno(int empno) throws SQLException {
        String sql="DELETE FROM employee WHERE EMPNO=?";
        int row=qr.update(sql,empno);
//        System.out.println("这是dao的值："+row);
        return row;
    }

    @Override
    public int selEmpByEmpno(int empno) throws SQLException {
        empdept nomal=new empdept();
        String sql="SELECT e.EMPNO,e.WAGENO,e.ATTENNO,e.ENAME,e.GENDER,e.TEL,e.EMAIL,e.ADDRESS,d.DEPTNAME  FROM dept d,employee e WHERE d.DEPTNO = e.DEPTNO and e.empno=?;";
        nomal=qr.query(sql,new BeanHandler<>(empdept.class),empno);
        if(nomal!=null){
            String sql1="SELECT * FROM nomaluser WHERE EMPNO=?";
            QueryRunner qr1=new QueryRunner(C3POUtilsXML.getDataSource());
            adduser user1=new adduser();
            user1=qr1.query(sql1,new BeanHandler<>(adduser.class),empno);
            if(user1==null)
                return 1;//可以注册
            else
                return 2;//已经使用
        }
        else
            return 3;//没有此编号
    }

    @Override
    public int selEmpEmpno(int empno) throws SQLException {
        employee emp=new employee();
        String sql="SELECT * FROM `employee` where EMPNO=?";
        emp=qr.query(sql,new BeanHandler<>(employee.class),empno);
        System.out.println("这是dao的第一个："+emp);
        if(emp!=null)
            return 2;
        else return 1;
    }

    @Override
    public int selEmpDeptno(int deptno) throws SQLException {
        dept dept=new dept();
        String sql="SELECT * FROM dept where DEPTNO=?";
        dept=qr.query(sql,new BeanHandler<>(dept.class),deptno);
        System.out.println("这是dao的第二个："+dept);
        if(dept!=null)
            return 4;
        else return 3;
    }

    @Override
    public int selEmpWageno(int wageno) throws SQLException {
        employee emp=new employee();
        String sql="SELECT * FROM `employee` where WAGENO=?";
        emp=qr.query(sql,new BeanHandler<>(employee.class),wageno);
        System.out.println("这是dao的第三个："+emp);
        if(emp!=null)
            return 6;
        else return 5;
    }

    @Override
    public int selEmpAttenno(int attenno) throws SQLException {
        employee emp=new employee();
        String sql="SELECT * FROM `employee` where ATTENNO=?";
        emp=qr.query(sql,new BeanHandler<>(employee.class),attenno);
        System.out.println("这是dao的第四个："+emp);
        if(emp!=null)
            return 8;
        else return 7;
    }



    @Override
    public void addEmp(employee employee) throws SQLException {
        String sql="INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?);";
        Object[] params={employee.getEMPNO(),employee.getDEPTNO(),employee.getWAGENO(),employee.getATTENNO(),employee.getENAME(),employee.getGENDER(),employee.getTEL(),employee.getEMAIL(),employee.getADDRESS()};
        int a=qr.update(sql,params);
        System.out.println("appemp是否插入成功"+a);
    }

    @Override
    public employeeS findByempno(int empno) throws SQLException {
        employeeS eMp=new employeeS();
        String sql="SELECT *  FROM employee e WHERE  EMPNO=?";
        eMp=qr.query(sql,new BeanHandler<>(employeeS.class),empno);
        System.out.println("这是dao:"+eMp);
        return eMp;
    }

    @Override
    public int updata(employee yee) throws SQLException {
       String sql="UPDATE employee SET DEPTNO=?,ENAME=?,GENDER=?,TEL=?,EMAIL=?,ADDRESS=? WHERE EMPNO=?";
       Object[] params={employee.getDEPTNO(),employee.getENAME(),employee.getGENDER(),employee.getTEL(),employee.getEMAIL(),employee.getADDRESS(),employee.getEMPNO()};
        int a=qr.update(sql,params);
        return a;
    }


}
