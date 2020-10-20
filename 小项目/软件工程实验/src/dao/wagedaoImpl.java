package dao;

import domain.AllWage;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.C3POUtilsXML;

import java.sql.SQLException;

public class wagedaoImpl implements wagedao{
    QueryRunner qr=new QueryRunner(C3POUtilsXML.getDataSource());
    @Override
    public AllWage findAllWage(int attenno, int wageno) throws SQLException {
        AllWage wage=new AllWage();
        String sql="SELECT WAGENO,ATTENNO,BASE_WAGE,DAY,VACATE,LATE,REAL_WAGE FROM wage,attendance where ATTENNO=? and WAGENO=?";
        wage=qr.query(sql,new BeanHandler<>(AllWage.class),attenno,wageno);
        System.out.println("这是dao的："+wage);
        return wage;
    }

    @Override
    public void updataAttedance(int attenno, int day, int late, int vacate) throws SQLException {
        String sql="UPDATE attendance SET DAY=?,VACATE=?,LATE=? WHERE ATTENNO=?";
        qr.update(sql,day,vacate,late,attenno);
    }

    @Override
    public void updataWage(int wageno, double real_wage, double base_wage) throws SQLException {
        String sql="UPDATE wage SET BASE_WAGE=?,REAL_WAGE=? WHERE WAGENO=?";
        qr.update(sql,base_wage,real_wage,wageno);
    }
}
