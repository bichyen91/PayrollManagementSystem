package PayrollManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class Payroll {

    private List<EmployeePayroll> employeesList;

    public Payroll() {
        this.employeesList = new LinkedList<>();
    }

    public boolean addEmployee(EmployeePayroll emp) {
        return employeesList.add(emp);
    }

    public List<EmployeePayroll> getEmployeesList() {
        return employeesList;
    }

    public EmployeePayroll getEmployee(String empId) {
        for (EmployeePayroll emp : employeesList) {
            if (emp.isActive() && emp.getId().equalsIgnoreCase(empId)) {
                return emp;
            }
        }
        return null;
    }
}
