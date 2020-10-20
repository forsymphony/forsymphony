package domain;

public class userlogin {
    private String ROOTID;
    private String RPASSWORD;

    public userlogin() {
    }

    public userlogin(String ROOTID, String RPASSWORD) {
        this.ROOTID = ROOTID;
        this.RPASSWORD = RPASSWORD;
    }

    @Override
    public String toString() {
        return "userlogin{" +
                "ROOTID='" + ROOTID + '\'' +
                ", RPASSWORD='" + RPASSWORD + '\'' +
                '}';
    }

    public String getROOTID() {
        return ROOTID;
    }

    public void setROOTID(String ROOTID) {
        this.ROOTID = ROOTID;
    }

    public String getRPASSWORD() {
        return RPASSWORD;
    }

    public void setRPASSWORD(String RPASSWORD) {
        this.RPASSWORD = RPASSWORD;
    }
}
