package domain;

public class adduser {
    private static int EMPNO;
    private static String NOMALID;
    private static String NPASSWORD;

    public adduser() {
    }

    public adduser(int EMPNO, String NOMALID, String NPASSWORD) {
        this.EMPNO = EMPNO;
        this.NOMALID = NOMALID;
        this.NPASSWORD = NPASSWORD;
    }

    @Override
    public String toString() {
        return "adduser{" +
                "EMPNO=" + EMPNO +
                ", NOMALID='" + NOMALID + '\'' +
                ", NPASSWORD='" + NPASSWORD + '\'' +
                '}';
    }

    public static int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public static String getNOMALID() {
        return NOMALID;
    }

    public void setNOMALID(String NOMALID) {
        this.NOMALID = NOMALID;
    }

    public static String getNPASSWORD() {
        return NPASSWORD;
    }

    public void setNPASSWORD(String NPASSWORD) {
        this.NPASSWORD = NPASSWORD;
    }
}
