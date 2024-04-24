package PayrollManagementSystem;

public class Employee {

    //Company setup
    private final int wrkdays;
    private final double taxRate;

    //Employee Info
    private String id;
    private String name;
    private String dob;
    private String position;
    private int periodEmployed;
    private boolean status;

    //Fixed pay
    private double monthlyPayRate;
    private double monthlyAllowance;

    //Leave
    private int leavesRemain;

    //Contructor
    public Employee(String id, String name, String dob, String position,
            int periodEmployed, double monthlyPayRate,
            double monthlyAllowance) {
        this.wrkdays = 23;
        this.taxRate = .1;
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.position = position;
        this.periodEmployed = periodEmployed;
        this.monthlyPayRate = monthlyPayRate;
        this.monthlyAllowance = monthlyAllowance;
        this.status = true;

        this.leavesRemain = 12;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPosition() {
        return position;
    }

    public int getPeriodEmployed() {
        return periodEmployed;
    }

    public double getMonthlyPayRate() {
        return monthlyPayRate;
    }

    public double getMonthlyAllowance() {
        return monthlyAllowance;
    }

    public boolean getStatus() {
        return status;
    }

    public int getLeavesRemain() {
        return leavesRemain;
    }

    public int getWrkdays() {
        return wrkdays;
    }

    public double getTaxRate() {
        return taxRate;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPeriodEmployed(int periodEmployed) {
        this.periodEmployed = periodEmployed;
    }

    public void setMonthlyPayRate(double monthlyPayRate) {
        this.monthlyPayRate = monthlyPayRate;
    }

    public void setMonthlyAllowance(double monthlyAllowance) {
        this.monthlyAllowance = monthlyAllowance;
    }

    public void setLeavesRemain(int leavesRemain) {
        this.leavesRemain = leavesRemain;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //</editor-fold>

    //Payroll functions
    public boolean isActive() {
        return status;
    }
}
