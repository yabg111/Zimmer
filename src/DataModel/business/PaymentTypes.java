package DataModel.business;

/**
 * @author טבלה זו מכילה את פירוט סוגי התשלום
 * @since 04/04/18
 * @page 120 {@code: 2.5.3.14}
 */
public class PaymentTypes {
	private Integer Payment_Type = null;
	private String Payment_Name = null;
	public Integer getPayment_Type() {
		return Payment_Type;
	}
	public void setPayment_Type(Integer payment_Type) {
		Payment_Type = payment_Type;
	}
	public String getPayment_Name() {
		return Payment_Name;
	}
	public void setPayment_Name(String payment_Name) {
		Payment_Name = payment_Name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentTypes [Payment_Type=");
		builder.append(Payment_Type);
		builder.append(", Payment_Name=");
		builder.append(Payment_Name);
		builder.append("]");
		return builder.toString();
	}
 
	
}
