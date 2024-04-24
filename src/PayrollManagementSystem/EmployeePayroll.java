package PayrollManagementSystem;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class EmployeePayroll extends Employee {

    private int period;
    private int periodLeavesRemain;
    private int periodPaidLeavesTaken;
    private int periodUnpaidLeavesTaken;

    //Pay slips
    private HashMap<Integer, String> paySlips;

    //Additional pay
    private double bonus;
    private double addDeduction;

    public EmployeePayroll(String id, String name, String dob, String position,
            int periodEmployed, double monthlyPayRate, double monthlyAllowance) {
        super(id, name, dob, position, periodEmployed, monthlyPayRate, monthlyAllowance);
        this.paySlips = new HashMap<>();
        this.periodLeavesRemain = this.getLeavesRemain();
        this.periodPaidLeavesTaken = 0;
        this.periodUnpaidLeavesTaken = 0;
    }

    public int getPeriod() {
        return period;
    }

    public int getPeriodLeavesRemain() {
        return periodLeavesRemain;
    }

    public int getPeriodPaidLeavesTaken() {
        return periodPaidLeavesTaken;
    }

    public int getPeriodUnpaidLeavesTaken() {
        return periodUnpaidLeavesTaken;
    }

    public void updateLeaves(int numOfDayOff) {
        if (this.getPeriodLeavesRemain() - numOfDayOff >= 0) {
            this.periodLeavesRemain -= numOfDayOff;
            this.periodPaidLeavesTaken = numOfDayOff;
        } else {
            if (this.getPeriodLeavesRemain() == 0) {
                this.periodUnpaidLeavesTaken = numOfDayOff;
            } else {
                this.periodPaidLeavesTaken = this.getPeriodLeavesRemain();
                this.periodUnpaidLeavesTaken = numOfDayOff - periodPaidLeavesTaken;
                this.periodLeavesRemain = 0;
            }
        }
        this.setLeavesRemain(this.getPeriodLeavesRemain());
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setAddDeduction(double addDeduction) {
        this.addDeduction = addDeduction;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setPeriodLeavesRemain(int periodLeavesRemain) {
        this.periodLeavesRemain = periodLeavesRemain;
    }

    public void setPeriodPaidLeavesTaken(int periodPaidLeavesTaken) {
        this.periodPaidLeavesTaken = periodPaidLeavesTaken;
    }

    public void setPeriodUnpaidLeavesTaken(int periodUnpaidLeavesTaken) {
        this.periodUnpaidLeavesTaken = periodUnpaidLeavesTaken;
    }

    public HashMap<Integer, String> getPaySlips() {
        return paySlips;
    }

    public String getPaySlipDetail(Integer targetKey) {
        String result = "";

        // Get the set of keys from the hashtable
        Set<Integer> keys = paySlips.keySet();

        // Iterate over the keys and print each key-value pair
        for (Integer key : keys) {
            if (Objects.equals(key, targetKey)) {
                result = paySlips.get(key);
            }
        }
        return result;
    }

    public String displayPeriod(String period) {
        String month = period.length() == 5
                ? period.substring(0, 1)
                : period.substring(0, 2);

        String year = period.length() == 5
                ? period.substring(1, 5)
                : period.substring(2, 6);
        return month + " - " + year;
    }

    public void generatePaySlip() {
        int key = this.period;
        String periodEmployed = displayPeriod(Integer.toString(this.getPeriodEmployed()));
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append("==================== Period ")
                .append(displayPeriod(Integer.toString(key)))
                .append(" ===================\n");
        sb.append("\nA. Employee Information\n    ID: ")
                .append(this.getId().toUpperCase()).append("\n");
        sb.append("    Employee: ").append(this.getName()
                .toUpperCase()).append("\n");
        sb.append("    DOB: ").append(this.getDob()).append("\n");
        sb.append("    Position: ").append(this.getPosition()).append("\n");
        sb.append("    Employed period: ").append(periodEmployed).append("\n");
        sb.append("\nB. Leaves\n");
        sb.append("    Paid Leaves this period: ").append(this.getPeriodPaidLeavesTaken()).append(" day(s)\n");
        sb.append("    Unpaid Leaves this period: ").append(this.getPeriodUnpaidLeavesTaken()).append(" day(s)\n");
        sb.append("    Leaves Remain: ").append(this.getLeavesRemain()).append(" day(s)\n");
        sb.append("\nC. Allowance\n");
        sb.append("    Monthly allowance: $").append(this.getMonthlyAllowance()).append("\n");
        sb.append("    Bonus: $").append(this.bonus).append("\n");
        sb.append("\nD. Deduction\n");
        sb.append("    Unpaid leave: $").append(df.format((this.getMonthlyPayRate()
                / this.getWrkdays() * this.getPeriodUnpaidLeavesTaken()))).append("\n");
        sb.append("    Taxes withholding: $");
        sb.append(df.format((this.getMonthlyPayRate() + this.getMonthlyAllowance() + this.bonus) * this.getTaxRate()));
        sb.append("\n");
        sb.append("    Additional deduction: $").append(this.addDeduction).append("\n");
        sb.append("\nE. Payment\n");
        sb.append("    Monthly Rate: $").append(this.getMonthlyPayRate()).append("\n");
        sb.append("    Total Allowances: $").append(this.getMonthlyAllowance() + this.bonus).append("\n");
        sb.append("    Gross pay: $").append(this.getMonthlyPayRate() + this.getMonthlyAllowance() + this.bonus).append("\n");
        sb.append("    Total deduction: $").append(df.format((getMonthlyPayRate() / this.getWrkdays() * this.getPeriodUnpaidLeavesTaken())
                + ((this.getMonthlyPayRate() + this.getMonthlyAllowance() + this.bonus) * this.getTaxRate()) + this.addDeduction)).append("\n");
        sb.append("    Net pay: $").append(df.format((this.getMonthlyPayRate() + this.getMonthlyAllowance() + this.bonus)
                - ((getMonthlyPayRate() / this.getWrkdays() * this.getPeriodUnpaidLeavesTaken())
                + ((this.getMonthlyPayRate() + this.getMonthlyAllowance() + this.bonus) * this.getTaxRate())
                + this.addDeduction))).append("\n");
        sb.append("\n=================================================\n");
        sb.append("Contact HR for any concerns: hr@yc.com");

        paySlips.put(key, sb.toString());
    }
}
