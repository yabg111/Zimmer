package DataModel.person;

import java.util.Date;

/**
 * @author מכילה את פרטי הלקוחות
 * @since 02/04/18
 * @page 113 {@code: 2.5.3.3}
 */
public class Customer {
	// ID sql
	private Integer customerNumber = null;
	private String customerName = null;
	private Date customerTZ = null; // TODO:is Date type
	private String customerEmail = null;
	private String customerPhone = null;

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCustomerTZ() {
		return customerTZ;
	}

	public void setCustomerTZ(Date customerTZ) {
		this.customerTZ = customerTZ;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerNumber=");
		builder.append(customerNumber);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerTZ=");
		builder.append(customerTZ);
		builder.append(", customerEmail=");
		builder.append(customerEmail);
		builder.append(", customerPhone=");
		builder.append(customerPhone);
		builder.append("]");
		return builder.toString();
	}

}
