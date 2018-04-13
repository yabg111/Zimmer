package BusinessLogical.ApplicationApi.models.HR;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import BusinessLogical.ApplicationApi.models.HR.ben.Employee;
import BusinessLogical.ApplicationApi.models.HR.ben.EmployeeWorkingPlan;

public class EmployeeListD11 {

	Logger logger = Logger.getLogger(EmployeeListD11.class.getName());
	private List<Employee> employeeList;
	private Employee employee;
	private List<EmployeeWorkingPlan> employeeWorkingPlan;

	public EmployeeListD11() {
		super();
		this.employeeList = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		try {
			if (employee == null) {
				throw new Exception("employee IS NULL :");
			} else {
				if (employeeList.isEmpty()) {
					employeeList = new ArrayList<>();
				}
				employeeList.add(employee);
			}
		} catch (Exception e) {
			logger.warning(Level.WARNING + "  : EmployeeListD11.addEmployee() ," + e);
		}

	}

	public void removeEmployee(Employee employee) {
		try {
			if (employee == null) {
				throw new Exception("employee IS NULL :");
			} else if (!employeeList.isEmpty()) {
				employeeList.removeIf(s -> s.getEmployeeNumber().equals(employee.getEmployeeNumber()));
			}
		} catch (Exception e) {
			logger.warning(Level.WARNING + "  : EmployeeListD11.removeEmployee() ," + e);
		}

	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<EmployeeWorkingPlan> getEmployeeWorkingPlan() {
		return employeeWorkingPlan;
	}

	public void setEmployeeWorkingPlan(List<EmployeeWorkingPlan> employeeWorkingPlan) {
		this.employeeWorkingPlan = employeeWorkingPlan;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeListD11 [logger=");
		builder.append(logger);
		builder.append(", employeeList=");
		builder.append(employeeList);
		builder.append(", employee=");
		builder.append(employee);
		builder.append(", employeeWorkingPlan=");
		builder.append(employeeWorkingPlan);
		builder.append("]");
		return builder.toString();
	}

}
