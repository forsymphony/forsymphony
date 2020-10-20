package domain;

public class AllWage {
//     <th>工资编号</th>
//                <th>考勤编号</th>
//                <th>基础工资</th>
//                <th>考勤天数</th>
//                <th>请假天数</th>
//                <th>迟到天数</th>
//                <th>实际工资</th>
    private int WAGENO;
    private int ATTENNO;
    private double BASE_WAGE;
    private int DAY;
    private int VACATE;
    private int LATE;
    private double REAL_WAGE;

    public AllWage() {
    }

    public AllWage(int WAGENO, int ATTENNO, double BASE_WAGE, int DAY, int VACATE, int LATE, double REAL_WAGE) {
        this.WAGENO = WAGENO;
        this.ATTENNO = ATTENNO;
        this.BASE_WAGE = BASE_WAGE;
        this.DAY = DAY;
        this.VACATE = VACATE;
        this.LATE = LATE;
        this.REAL_WAGE = REAL_WAGE;
    }

    @Override
    public String toString() {
        return "AllWage{" +
                "WAGENO=" + WAGENO +
                ", ATTENNO=" + ATTENNO +
                ", BASE_WAGE=" + BASE_WAGE +
                ", DAY=" + DAY +
                ", VACATE=" + VACATE +
                ", LATE=" + LATE +
                ", REAL_WAGE=" + REAL_WAGE +
                '}';
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

    public double getBASE_WAGE() {
        return BASE_WAGE;
    }

    public void setBASE_WAGE(double BASE_WAGE) {
        this.BASE_WAGE = BASE_WAGE;
    }

    public int getDAY() {
        return DAY;
    }

    public void setDAY(int DAY) {
        this.DAY = DAY;
    }

    public int getVACATE() {
        return VACATE;
    }

    public void setVACATE(int VACATE) {
        this.VACATE = VACATE;
    }

    public int getLATE() {
        return LATE;
    }

    public void setLATE(int LATE) {
        this.LATE = LATE;
    }

    public double getREAL_WAGE() {
        return REAL_WAGE;
    }

    public void setREAL_WAGE(double REAL_WAGE) {
        this.REAL_WAGE = REAL_WAGE;
    }
}
