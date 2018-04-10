package DataModel.business;

/**
 * @author טבלה זו מכילה חשבוניות שהועברו ללקוחות
 * @since 04/04/18
 * @page 118 {@code: 2.5.3.12}
 */
public class Invoices {
	private Integer ID = null;
	private Integer vacationNumber = null;
	private Integer paymentID = null;
	private Integer price = null;
	private String comments = null;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getVacationNumber() {
		return vacationNumber;
	}

	public void setVacationNumber(Integer vacationNumber) {
		this.vacationNumber = vacationNumber;
	}

	public Integer getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Integer paymentID) {
		this.paymentID = paymentID;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoices [ID=");
		builder.append(ID);
		builder.append(", vacationNumber=");
		builder.append(vacationNumber);
		builder.append(", paymentID=");
		builder.append(paymentID);
		builder.append(", price=");
		builder.append(price);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", getID()=");
		builder.append(getID());
		builder.append(", getVacationNumber()=");
		builder.append(getVacationNumber());
		builder.append(", getPaymentID()=");
		builder.append(getPaymentID());
		builder.append(", getPrice()=");
		builder.append(getPrice());
		builder.append(", getComments()=");
		builder.append(getComments());
		builder.append("]");
		return builder.toString();
	}

}
