package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

/**
 * @author טבלה זו מכילה את הזמנות הצימרים ע"פ חופשות ולקוחות
 * @since 02/04/18
 * @page 114 {@code: 2.5.3.4}
 */
public class CustomerVacationZimmerData {
	private Integer customerNumber = null;
	private Integer vacationNumber = null;
	private Integer zimmerNumber = null;

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Integer getVacationNumber() {
		return vacationNumber;
	}

	public void setVacationNumber(Integer vacationNumber) {
		this.vacationNumber = vacationNumber;
	}

	public Integer getZimmerNumber() {
		return zimmerNumber;
	}

	public void setZimmerNumber(Integer zimmerNumber) {
		this.zimmerNumber = zimmerNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerVacationZimmerData [customerNumber=");
		builder.append(customerNumber);
		builder.append(", vacationNumber=");
		builder.append(vacationNumber);
		builder.append(", zimmerNumber=");
		builder.append(zimmerNumber);
		builder.append(", getCustomerNumber()=");
		builder.append(getCustomerNumber());
		builder.append(", getVacationNumber()=");
		builder.append(getVacationNumber());
		builder.append(", getZimmerNumber()=");
		builder.append(getZimmerNumber());
		builder.append("]");
		return builder.toString();
	}
}
