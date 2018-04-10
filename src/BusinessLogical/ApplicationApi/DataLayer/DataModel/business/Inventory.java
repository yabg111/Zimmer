package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

/**
 * @author טבלה זו מכילה את מלאי הצימר
 * @since 02/04/18
 * @page 116 {@code: 2.5.3.8}
 */
public class Inventory {
	private Integer inventoryNumber = null;
	private String nventory_Name = null;
	private Integer inventoryAmount = null;
	private Integer inventoryCompany = null;

	public Integer getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(Integer inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public String getNventory_Name() {
		return nventory_Name;
	}

	public void setNventory_Name(String nventory_Name) {
		this.nventory_Name = nventory_Name;
	}

	public Integer getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(Integer inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	public Integer getInventoryCompany() {
		return inventoryCompany;
	}

	public void setInventoryCompany(Integer inventoryCompany) {
		this.inventoryCompany = inventoryCompany;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Inventory [inventoryNumber=");
		builder.append(inventoryNumber);
		builder.append(", nventory_Name=");
		builder.append(nventory_Name);
		builder.append(", inventoryAmount=");
		builder.append(inventoryAmount);
		builder.append(", inventoryCompany=");
		builder.append(inventoryCompany);
		builder.append(", getInventoryNumber()=");
		builder.append(getInventoryNumber());
		builder.append(", getNventory_Name()=");
		builder.append(getNventory_Name());
		builder.append(", getInventoryAmount()=");
		builder.append(getInventoryAmount());
		builder.append(", getInventoryCompany()=");
		builder.append(getInventoryCompany());
		builder.append("]");
		return builder.toString();
	}

}
