package BusinessLogical.ApplicationApi.models.HR.ben;

import java.util.Date;

/**
 * @author טבלה זו מכילה חשבוניות עבור משכורות עובדים
 * @since 02/04/18
 * @page 114 {@code: 2.5.3.5}
 */
public class EmployeeInvoice {
	private Integer invoiceNumber;
	private Integer employeeNumber;
	private Integer paymentAmount;
	private Date paymentDate;

	private Employee employee;

	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeInvoice [invoiceNumber=");
		builder.append(invoiceNumber);
		builder.append(", employeeNumber=");
		builder.append(employeeNumber);
		builder.append(", paymentAmount=");
		builder.append(paymentAmount);
		builder.append(", paymentDate=");
		builder.append(paymentDate);
		builder.append(", employee=");
		builder.append(employee);
		builder.append("]");
		return builder.toString();
	}

}
