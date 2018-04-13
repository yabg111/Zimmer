package BusinessLogical.ApplicationApi.models.HR.ben;

import java.util.Date;

/**
 * @author ���� �� ����� �� ������ ������ �������
 * @since 02/04/18
 * @page 115 {@code: 2.5.3.6}
 */
public class EmployeeWorkingPlan {
	private Integer employeeNumber = null;
	private Date startWork = null;
	private Date endWork = null;
	private Integer serviceType = null;

	private Employee employee;
	private ServiceType typeService;

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Date getStartWork() {
		return startWork;
	}

	public void setStartWork(Date startWork) {
		this.startWork = startWork;
	}

	public Date getEndWork() {
		return endWork;
	}

	public void setEndWork(Date endWork) {
		this.endWork = endWork;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ServiceType getTypeService() {
		return typeService;
	}

	public void setTypeService(ServiceType typeService) {
		this.typeService = typeService;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeWorkingPlan [employeeNumber=");
		builder.append(employeeNumber);
		builder.append(", startWork=");
		builder.append(startWork);
		builder.append(", endWork=");
		builder.append(endWork);
		builder.append(", serviceType=");
		builder.append(serviceType);
		builder.append(", employee=");
		builder.append(employee);
		builder.append(", typeService=");
		builder.append(typeService);
		builder.append("]");
		return builder.toString();
	}

}
