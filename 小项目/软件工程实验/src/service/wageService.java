package service;

import domain.AllWage;

import java.sql.SQLException;

public interface wageService {
    public abstract AllWage findAllWage(int attenno, int wageno) throws SQLException;

    public abstract void updataAttedance(int attenno, int day, int late, int vacate) throws SQLException;

    public abstract void updataWage(int wageno, double real_wage, double base_wage) throws SQLException;
}
