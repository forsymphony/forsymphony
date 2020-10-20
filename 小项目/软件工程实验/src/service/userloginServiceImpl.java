package service;

import dao.userloginImpl;
import dao.userlogindao;
import domain.adduser;
import domain.userlogin;
import domain.userlogin2;
import org.apache.commons.dbutils.QueryRunner;
import utils.C3POUtilsXML;

import java.sql.SQLException;

public class userloginServiceImpl implements userloginService {
    userlogindao user1=new userloginImpl();
    @Override
    public userlogin findroot(String userid) throws SQLException {
        userlogin a=new userlogin();
        a=user1.findroot(userid);
        System.out.println("这是service层的user:"+a);
        return  a;
    }

    @Override
    public userlogin2 findnomal(String userid) throws SQLException {
        userlogin2 a=new userlogin2();
        a=user1.findnomal(userid);
        System.out.println("这是2service层的user:"+a);
        return  a;
    }

    @Override
    public void adduser(adduser user) throws SQLException{
        user1.adduser(user);
    }
}
