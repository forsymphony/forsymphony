package domain;

public class dept {
    private int DEPTNO;
    private String DEPTNAME;

    public dept() {
    }

    public dept(int DEPTNO, String DEPTNAME) {
        this.DEPTNO = DEPTNO;
        this.DEPTNAME = DEPTNAME;
    }

    @Override
    public String toString() {
        return "dept{" +
                "DEPTNO=" + DEPTNO +
                ", DEPTNAME='" + DEPTNAME + '\'' +
                '}';
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDEPTNAME() {
        return DEPTNAME;
    }

    public void setDEPTNAME(String DEPTNAME) {
        this.DEPTNAME = DEPTNAME;
    }
}
