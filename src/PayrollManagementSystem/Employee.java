package PayrollManagementSystem;

import java.text.DecimalFormat;
import java.util.Hashtable;

public class Employee {

    //Company setup
    private final int wrkdays;
    private final double taxRate;

    //Employee Info
    private int id;
    private String name;
    private String dob;
    private String position;
    private int monthEmployed;
    private int yearEmployed;
    private boolean status;

    //Fixed pay
    private double monthlyPayRate;
    private double monthlyAllowance;

    //Additional pay
    private double bonus;

    //Leave
    private int leavesRemain;
    private int paidLeavesTaken;
    private int unpaidLeavesTaken;
    private double addDeduction;

    //Pay slips
    private Hashtable<int[], String> paySlips;
    private int monthPaySlip;
    private int yearPaySlip;

    //Contructor
    public Employee(int id, String name, String dob, String position,
            int monthEmployed, int yearEmployed, double monthlyPayRate,
            double monthlyAllowance) {
        this.wrkdays = 23;
        this.taxRate = .1;
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.position = position;
        this.monthEmployed = monthEmployed;
        this.yearEmployed = yearEmployed;
        this.monthlyPayRate = monthlyPayRate;
        this.monthlyAllowance = monthlyAllowance;
        this.status = true;

        this.leavesRemain = 12;
        this.paidLeavesTaken = 0;
        this.unpaidLeavesTaken = 0;

        this.paySlips = new Hashtable<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getId() {
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

    public int getMonthEmployed() {
        return monthEmployed;
    }

    public int getYearEmployed() {
        return yearEmployed;
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

    public int getMonthPaySlip() {
        return monthPaySlip;
    }

    public int getYearPaySlip() {
        return yearPaySlip;
    }

    public Hashtable<int[], String> getPaySlips() {
        return paySlips;
    }

    public String getPaySlipDetail(int[] key) {
        return paySlips.get(key.hashCode());
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

    public void setMonthEmployed(int monthEmployed) {
        this.monthEmployed = monthEmployed;
    }

    public void setYearEmployed(int yearEmployed) {
        this.yearEmployed = yearEmployed;
    }

    public void setMonthlyPayRate(double monthlyPayRate) {
        this.monthlyPayRate = monthlyPayRate;
    }

    public void setMonthlyAllowance(double monthlyAllowance) {
        this.monthlyAllowance = monthlyAllowance;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setAddDeduction(double addDeduction) {
        this.addDeduction = addDeduction;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMonthPaySlip(int monthPaySlip) {
        this.monthPaySlip = monthPaySlip;
    }

    public void setYearPaySlip(int yearPaySlip) {
        this.yearPaySlip = yearPaySlip;
    }
    //</editor-fold>

    //Payroll functions
    public boolean isActive() {
        return status;
    }

    public void updateLeaves(int numOfDayOff) {
        if (this.leavesRemain - numOfDayOff >= 0) {
            this.leavesRemain -= numOfDayOff;
            this.paidLeavesTaken = numOfDayOff;
        } else {
            if (this.leavesRemain == 0) {
                this.unpaidLeavesTaken = numOfDayOff;
            } else {
                this.paidLeavesTaken = leavesRemain;
                this.unpaidLeavesTaken = numOfDayOff - paidLeavesTaken;
                this.leavesRemain = 0;
            }
        }
    }

    public void generatePaySlip() {
        int[] key = {monthPaySlip, yearPaySlip};
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append("\n==================== Pay Slip ").append(monthPaySlip).append(yearPaySlip).append("===================\n");
        sb.append("\nA. Employee Information\n   ID: ").append(this.id).append("\n");
        sb.append("   Employee: ").append(this.name.toUpperCase()).append("\n");
        sb.append("   DOB: ").append(this.dob).append("\n");
        sb.append("   Position: ").append(this.position).append("\n");
        sb.append("   Employed period: ").append(monthEmployed).append(" - ").append(this.yearEmployed).append("\n");
        sb.append("\nB. Leaves\n");
        sb.append("   Paid Leaves this period: ").append(this.paidLeavesTaken).append(" day(s)\n");
        sb.append("   Unpaid Leaves this period: ").append(this.unpaidLeavesTaken).append(" day(s)\n");
        sb.append("   Leaves Remain: ").append(this.leavesRemain).append(" day(s)\n");
        sb.append("\nC. Allowance\n");
        sb.append("   Monthly allowance: $").append(this.monthlyAllowance).append("\n");
        sb.append("   Bonus: $").append(this.bonus).append("\n");
        sb.append("\nD. Deduction\n");
        sb.append("   Unpaid leave: $").append(df.format((monthlyPayRate / this.wrkdays * this.unpaidLeavesTaken))).append("\n");
        sb.append("   Taxes withholding: $");
        sb.append(df.format((this.monthlyPayRate + this.monthlyAllowance + this.bonus) * this.taxRate));
        sb.append("\n");
        sb.append("   Additional deduction: $").append(this.addDeduction).append("\n");
        sb.append("\nE. Payment\n");
        sb.append("   Monthly Rate: $").append(this.monthlyPayRate).append("\n");
        sb.append("   Total Allowances: $").append(this.monthlyAllowance + this.bonus).append("\n");
        sb.append("   Gross pay: $").append(this.monthlyPayRate + this.monthlyAllowance + this.bonus).append("\n");
        sb.append("   Total deduction: $").append(df.format((monthlyPayRate / this.wrkdays * this.unpaidLeavesTaken)
                + ((this.monthlyPayRate + this.monthlyAllowance + this.bonus) * this.taxRate) + this.addDeduction)).append("\n");
        sb.append("   Net pay: $").append(df.format((this.monthlyPayRate + this.monthlyAllowance + this.bonus)
                - ((monthlyPayRate / this.wrkdays * this.unpaidLeavesTaken)
                + ((this.monthlyPayRate + this.monthlyAllowance + this.bonus) * this.taxRate)
                + this.addDeduction))).append("\n");
        sb.append("\n=================================================\n");
        sb.append("Contact HR for any concerns: hr@yc.com\n");

        paySlips.put(key, sb.toString());
    }
}
