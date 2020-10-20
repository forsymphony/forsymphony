package dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.adduser;
import domain.userlogin;
import domain.userlogin2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.C3POUtilsXML;

import java.sql.SQLException;

public class userloginImpl implements userlogindao {
    QueryRunner qr=new QueryRunner(C3POUtilsXML.getDataSource());
    @Override
    public userlogin findroot(String userid) throws SQLException {
        userlogin user=new userlogin();
        String sql="SELECT * FROM rootuser WHERE ROOTID=?";
        user=qr.query(sql,new BeanHandler<>(userlogin.class),userid);
        System.out.println("这是新的dao层的user:"+user);
        return  user;

    }

    @Override
    public userlogin2 findnomal(String userid) throws SQLException {
        userlogin2 user=new userlogin2();
        String sql="SELECT * FROM nomaluser WHERE NOMALID=?";
        user=qr.query(sql,new BeanHandler<>(userlogin2.class),userid);
        System.out.println("这是dao层的user:"+user);
        return  user;
    }

    @Override
    public void adduser(adduser user) throws SQLException {
        String sql="INSERT INTO nomaluser VALUES(?,?,?);";
        Object[] params={adduser.getEMPNO(),adduser.getNOMALID(),adduser.getNPASSWORD()};
        qr.update(sql,params);
    }
}
