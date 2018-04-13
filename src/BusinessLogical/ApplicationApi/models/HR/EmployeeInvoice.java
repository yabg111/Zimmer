package BusinessLogical.ApplicationApi.models.HR;

import java.util.Date;

import BusinessLogical.ApplicationApi.models.HR.ben.Employee;

/**
 * @author טבלה זו מכילה חשבוניות עבור משכורות עובדים
 * @since 02/04/18
 * @page 114 {@code: 2.5.3.5}
 */
public class EmployeeInvoice {
	private Integer invoiceNumber = null;
	private Integer employeeNumber = null;
	private Integer paymentAmount = null;
	private Date paymentDate = null;

	private Employee employee; 
	//ביצוע תשלומים
	public void makePayments(){
		
	}
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
		builder.append(", getInvoiceNumber()=");
		builder.append(getInvoiceNumber());
		builder.append(", getEmployeeNumber()=");
		builder.append(getEmployeeNumber());
		builder.append(", getPaymentAmount()=");
		builder.append(getPaymentAmount());
		builder.append(", getPaymentDate()=");
		builder.append(getPaymentDate());
		builder.append("]");
		return builder.toString();
	}

}
