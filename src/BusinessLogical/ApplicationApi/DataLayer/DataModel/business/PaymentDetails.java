package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

import java.util.Date;

/**
 * @author טבלה זו מכילה את פרטי התשלום )מספר כרטיס אשראי, תוקף וכו'(.
 * @since 04/04/18
 * @page 119 {@code: 2.5.3.13}
 */
public class PaymentDetails {
	private Integer payment_ID = null;
	private Integer vacation_Number = null;
	private Date expire_Date = null;
	private Integer customer_Number = null;
	private Integer number_Of_Payment = null;
	private String card_Owner_TZ = null;
	private String card_Owner_Name = null;
	private Integer currency_Kind = null;
	private Integer credit_Card_Number = null;
	private Integer check_Number = null;
	private Integer payment_Type = null;

	public Integer getPayment_ID() {
		return payment_ID;
	}

	public void setPayment_ID(Integer payment_ID) {
		this.payment_ID = payment_ID;
	}

	public Integer getVacation_Number() {
		return vacation_Number;
	}

	public void setVacation_Number(Integer vacation_Number) {
		this.vacation_Number = vacation_Number;
	}

	public Date getExpire_Date() {
		return expire_Date;
	}

	public void setExpire_Date(Date expire_Date) {
		this.expire_Date = expire_Date;
	}

	public Integer getCustomer_Number() {
		return customer_Number;
	}

	public void setCustomer_Number(Integer customer_Number) {
		this.customer_Number = customer_Number;
	}

	public Integer getNumber_Of_Payment() {
		return number_Of_Payment;
	}

	public void setNumber_Of_Payment(Integer number_Of_Payment) {
		this.number_Of_Payment = number_Of_Payment;
	}

	public String getCard_Owner_TZ() {
		return card_Owner_TZ;
	}

	public void setCard_Owner_TZ(String card_Owner_TZ) {
		this.card_Owner_TZ = card_Owner_TZ;
	}

	public String getCard_Owner_Name() {
		return card_Owner_Name;
	}

	public void setCard_Owner_Name(String card_Owner_Name) {
		this.card_Owner_Name = card_Owner_Name;
	}

	public Integer getCurrency_Kind() {
		return currency_Kind;
	}

	public void setCurrency_Kind(Integer currency_Kind) {
		this.currency_Kind = currency_Kind;
	}

	public Integer getCredit_Card_Number() {
		return credit_Card_Number;
	}

	public void setCredit_Card_Number(Integer credit_Card_Number) {
		this.credit_Card_Number = credit_Card_Number;
	}

	public Integer getCheck_Number() {
		return check_Number;
	}

	public void setCheck_Number(Integer check_Number) {
		this.check_Number = check_Number;
	}

	public Integer getPayment_Type() {
		return payment_Type;
	}

	public void setPayment_Type(Integer payment_Type) {
		this.payment_Type = payment_Type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentDetails [payment_ID=");
		builder.append(payment_ID);
		builder.append(", vacation_Number=");
		builder.append(vacation_Number);
		builder.append(", expire_Date=");
		builder.append(expire_Date);
		builder.append(", customer_Number=");
		builder.append(customer_Number);
		builder.append(", number_Of_Payment=");
		builder.append(number_Of_Payment);
		builder.append(", card_Owner_TZ=");
		builder.append(card_Owner_TZ);
		builder.append(", card_Owner_Name=");
		builder.append(card_Owner_Name);
		builder.append(", currency_Kind=");
		builder.append(currency_Kind);
		builder.append(", credit_Card_Number=");
		builder.append(credit_Card_Number);
		builder.append(", check_Number=");
		builder.append(check_Number);
		builder.append(", payment_Type=");
		builder.append(payment_Type);
		builder.append(", getPayment_ID()=");
		builder.append(getPayment_ID());
		builder.append(", getVacation_Number()=");
		builder.append(getVacation_Number());
		builder.append(", getExpire_Date()=");
		builder.append(getExpire_Date());
		builder.append(", getCustomer_Number()=");
		builder.append(getCustomer_Number());
		builder.append(", getNumber_Of_Payment()=");
		builder.append(getNumber_Of_Payment());
		builder.append(", getCard_Owner_TZ()=");
		builder.append(getCard_Owner_TZ());
		builder.append(", getCard_Owner_Name()=");
		builder.append(getCard_Owner_Name());
		builder.append(", getCurrency_Kind()=");
		builder.append(getCurrency_Kind());
		builder.append(", getCredit_Card_Number()=");
		builder.append(getCredit_Card_Number());
		builder.append(", getCheck_Number()=");
		builder.append(getCheck_Number());
		builder.append(", getPayment_Type()=");
		builder.append(getPayment_Type());
		builder.append("]");
		return builder.toString();
	}

}
