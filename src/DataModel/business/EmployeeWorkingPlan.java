package DataModel.business;

import java.util.Date;

/**
 * @author טבלה זו מכילה את תוכנית העבודה לעובדים
 * @since 02/04/18
 * @page 115 {@code: 2.5.3.6}
 */
public class EmployeeWorkingPlan {
	private Integer employeeNumber = null;
	private Date startWork = null;
	private Date endWork = null;
	private Integer serviceType = null;

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
		builder.append(", getEmployeeNumber()=");
		builder.append(getEmployeeNumber());
		builder.append(", getStartWork()=");
		builder.append(getStartWork());
		builder.append(", getEndWork()=");
		builder.append(getEndWork());
		builder.append(", getServiceType()=");
		builder.append(getServiceType());
		builder.append("]");
		return builder.toString();
	}

}
