package DataModel.business;

import java.util.Date;

/**
 * @author טבלה זו מכילה חשבוניות שהתקבלו עבור המלאי .
 * @since 04/04/18
 * @page 117 {@code: 2.5.3.10}
 */
public class InventoryInvoic {
	private Integer inventoryNumber = null;
	private Integer invoiceNumber = null;
	private Integer supplierNumber = null;
	private Integer amount = null;
	private Date invoiceDate = null;
	private Integer invoicePrice = null;

	public Integer getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(Integer inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Integer getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(Integer supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Integer getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(Integer invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InventoryInvoic [inventoryNumber=");
		builder.append(inventoryNumber);
		builder.append(", invoiceNumber=");
		builder.append(invoiceNumber);
		builder.append(", supplierNumber=");
		builder.append(supplierNumber);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", invoiceDate=");
		builder.append(invoiceDate);
		builder.append(", invoicePrice=");
		builder.append(invoicePrice);
		builder.append(", getInventoryNumber()=");
		builder.append(getInventoryNumber());
		builder.append(", getInvoiceNumber()=");
		builder.append(getInvoiceNumber());
		builder.append(", getSupplierNumber()=");
		builder.append(getSupplierNumber());
		builder.append(", getAmount()=");
		builder.append(getAmount());
		builder.append(", getInvoiceDate()=");
		builder.append(getInvoiceDate());
		builder.append(", getInvoicePrice()=");
		builder.append(getInvoicePrice());
		builder.append("]");
		return builder.toString();
	}

}
