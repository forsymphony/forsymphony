package service;

import dao.wagedao;
import dao.wagedaoImpl;
import domain.AllWage;

import java.sql.SQLException;

public class wageServiceImpl implements wageService {
    wagedao dao=new wagedaoImpl();
    @Override
    public AllWage findAllWage(int attenno, int wageno) throws SQLException {
        AllWage wage=new AllWage();
        wage=dao.findAllWage(attenno,wageno);
        return wage;

    }

    @Override
    public void updataAttedance(int attenno, int day, int late, int vacate) throws SQLException {
        dao.updataAttedance(attenno,day,late,vacate);
    }

    @Override
    public void updataWage(int wageno, double real_wage, double base_wage) throws SQLException {
        dao.updataWage(wageno,real_wage,base_wage);
    }
}
