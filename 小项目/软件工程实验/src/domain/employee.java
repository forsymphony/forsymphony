package domain;

public class employee {
    private static int EMPNO;
    private static int DEPTNO;
    private static int WAGENO;
    private static int ATTENNO ;
    private static String ENAME;
    private static String GENDER;
    private static String TEL;
    private static String EMAIL;
    private static String ADDRESS;

    public employee() {
    }

    public employee(int EMPNO, int DEPTNO, int WAGENO, int ATTENNO, String ENAME, String GENDER, String TEL, String EMAIL, String ADDRESS) {
        this.EMPNO = EMPNO;
        this.DEPTNO = DEPTNO;
        this.WAGENO = WAGENO;
        this.ATTENNO = ATTENNO;
        this.ENAME = ENAME;
        this.GENDER = GENDER;
        this.TEL = TEL;
        this.EMAIL = EMAIL;
        this.ADDRESS = ADDRESS;
    }

    @Override
    public String toString() {
        return "employee{" +
                "EMPNO=" + EMPNO +
                ", DEPTNO=" + DEPTNO +
                ", WAGENO=" + WAGENO +
                ", ATTENNO=" + ATTENNO +
                ", ENAME='" + ENAME + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", TEL='" + TEL + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                '}';
    }

    public static int getEMPNO() {
        return EMPNO;
    }

    public  void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public static int getDEPTNO() {
        return DEPTNO;
    }

    public  void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public static int getWAGENO() {
        return WAGENO;
    }

    public  void setWAGENO(int WAGENO) {
        this.WAGENO = WAGENO;
    }

    public static int getATTENNO() {
        return ATTENNO;
    }

    public  void setATTENNO(int ATTENNO) {
        this.ATTENNO = ATTENNO;
    }

    public static String getENAME() {
        return ENAME;
    }

    public  void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public static String getGENDER() {
        return GENDER;
    }

    public  void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public static String getTEL() {
        return TEL;
    }

    public  void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public  void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public static String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
}
