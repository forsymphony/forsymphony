package dao;

import domain.adduser;
import domain.userlogin;
import domain.userlogin2;

import java.sql.SQLException;

public interface userlogindao {
    public abstract userlogin findroot(String userid) throws SQLException;
    public abstract userlogin2 findnomal(String userid) throws SQLException;
    public abstract void adduser(adduser user) throws SQLException;
}
