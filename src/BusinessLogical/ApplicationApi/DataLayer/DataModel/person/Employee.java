package BusinessLogical.ApplicationApi.DataLayer.DataModel.person;
 

/**
 * @author טבלה זו מכילה את נתוני העובדים
 * @since 02/04/18
 * @page 115 {@code: 2.5.3.7}
 */
public class Employee {
	private Integer employeeNumber = null;
	private String employeeName = null;
	private Integer cityNumber = null;
	private Integer streetNumber = null;
	private Integer salary = null;
	private String phoneNumber = null;
	private Integer serviceType = null;
	private String accoutID = null;

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getCityNumber() {
		return cityNumber;
	}

	public void setCityNumber(Integer cityNumber) {
		this.cityNumber = cityNumber;
	}

	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public String getAccoutID() {
		return accoutID;
	}

	public void setAccoutID(String accoutID) {
		this.accoutID = accoutID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employees [employeeNumber=");
		builder.append(employeeNumber);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", cityNumber=");
		builder.append(cityNumber);
		builder.append(", streetNumber=");
		builder.append(streetNumber);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", serviceType=");
		builder.append(serviceType);
		builder.append(", accoutID=");
		builder.append(accoutID);
		builder.append(", getEmployeeNumber()=");
		builder.append(getEmployeeNumber());
		builder.append(", getEmployeeName()=");
		builder.append(getEmployeeName());
		builder.append(", getCityNumber()=");
		builder.append(getCityNumber());
		builder.append(", getStreetNumber()=");
		builder.append(getStreetNumber());
		builder.append(", getSalary()=");
		builder.append(getSalary());
		builder.append(", getPhoneNumber()=");
		builder.append(getPhoneNumber());
		builder.append(", getServiceType()=");
		builder.append(getServiceType());
		builder.append(", getAccoutID()=");
		builder.append(getAccoutID());
		builder.append("]");
		return builder.toString();
	}

}
