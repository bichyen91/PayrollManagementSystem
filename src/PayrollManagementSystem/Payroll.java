package PayrollManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class Payroll {

    //<editor-fold defaultstate="collapsed" desc="Attributes">
    private List<EmployeePayroll> employeesList;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Contructor">
    public Payroll() {
        this.employeesList = new LinkedList<>();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Payroll support function">
    public boolean addEmployee(EmployeePayroll emp) {
        return employeesList.add(emp);
    }

    public List<EmployeePayroll> getEmployeesList() {
        return employeesList;
    }

    public EmployeePayroll getEmployee(String empId) {
        for (EmployeePayroll emp : employeesList) {
            if (emp.getId().equalsIgnoreCase(empId)) {
                return emp;
            }
        }
        return null;
    }
    //</editor-fold>
}
