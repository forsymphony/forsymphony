package domain;

public class userlogin2 {
    private String NOMALID;
    private String NPASSWORD;

    public userlogin2() {
    }

    @Override
    public String toString() {
        return "userlogin2{" +
                "NOMALID='" + NOMALID + '\'' +
                ", NPASSWORD='" + NPASSWORD + '\'' +
                '}';
    }

    public userlogin2(String NOMALID, String NPASSWORD) {
        this.NOMALID = NOMALID;
        this.NPASSWORD = NPASSWORD;
    }

    public String getNOMALID() {
        return NOMALID;
    }

    public void setNOMALID(String NOMALID) {
        this.NOMALID = NOMALID;
    }

    public String getNPASSWORD() {
        return NPASSWORD;
    }

    public void setNPASSWORD(String NPASSWORD) {
        this.NPASSWORD = NPASSWORD;
    }
}
