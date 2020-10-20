package domain;

public class empdept {
    private int EMPNO;
    private int WAGENO;
    private int ATTENNO;
    private String ENAME;
    private String GENDER;
    private String TEL;
    private String EMAIL;
    private String ADDRESS;
    private String DEPTNAME;

    public empdept() {
    }

    public empdept(int EMPNO, int WAGENO, int ATTENNO, String ENAME, String GENDER, String TEL, String EMAIL, String ADDRESS, String DEPTNAME) {
        this.EMPNO = EMPNO;
        this.WAGENO = WAGENO;
        this.ATTENNO = ATTENNO;
        this.ENAME = ENAME;
        this.GENDER = GENDER;
        this.TEL = TEL;
        this.EMAIL = EMAIL;
        this.ADDRESS = ADDRESS;
        this.DEPTNAME = DEPTNAME;
    }

    @Override
    public String toString() {
        return "empdept{" +
                "EMPNO=" + EMPNO +
                ", WAGENO=" + WAGENO +
                ", ATTENNO=" + ATTENNO +
                ", ENAME='" + ENAME + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", TEL='" + TEL + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", DEPTNAME='" + DEPTNAME + '\'' +
                '}';
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public int getWAGENO() {
        return WAGENO;
    }

    public void setWAGENO(int WAGENO) {
        this.WAGENO = WAGENO;
    }

    public int getATTENNO() {
        return ATTENNO;
    }

    public void setATTENNO(int ATTENNO) {
        this.ATTENNO = ATTENNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getDEPTNAME() {
        return DEPTNAME;
    }

    public void setDEPTNAME(String DEPTNAME) {
        this.DEPTNAME = DEPTNAME;
    }
}
