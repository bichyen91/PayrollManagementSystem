package PayrollManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class Payroll {

    private List<Employee> employeesList;

    public Payroll() {
        this.employeesList = new LinkedList<>();
    }

    public boolean addEmployee(Employee emp) {
        return employeesList.add(emp);
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public Employee getEmployee(String empId) {
        for (Employee emp : employeesList) {
            if (emp.isActive() && emp.getId().equalsIgnoreCase(empId)) {
                return emp;
            }
        }
        return null;
    }

}
