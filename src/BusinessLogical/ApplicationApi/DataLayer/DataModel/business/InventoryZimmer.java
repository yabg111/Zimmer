package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

/**
 * @author טבלה זו מכילה מלאי שיש בכל צימר
 * @since 02/04/18
 * @page 117 {@code: 2.5.3.11}
 */
public class InventoryZimmer {
	private Integer inventoryNumber = null;
	private Integer zimmerNumber = null;
	private Integer quantityAtZimmer = null;

	public Integer getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(Integer inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public Integer getZimmerNumber() {
		return zimmerNumber;
	}

	public void setZimmerNumber(Integer zimmerNumber) {
		this.zimmerNumber = zimmerNumber;
	}

	public Integer getQuantityAtZimmer() {
		return quantityAtZimmer;
	}

	public void setQuantityAtZimmer(Integer quantityAtZimmer) {
		this.quantityAtZimmer = quantityAtZimmer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InventoryZimmer [inventoryNumber=");
		builder.append(inventoryNumber);
		builder.append(", zimmerNumber=");
		builder.append(zimmerNumber);
		builder.append(", quantityAtZimmer=");
		builder.append(quantityAtZimmer);
		builder.append(", getInventoryNumber()=");
		builder.append(getInventoryNumber());
		builder.append(", getZimmerNumber()=");
		builder.append(getZimmerNumber());
		builder.append(", getQuantityAtZimmer()=");
		builder.append(getQuantityAtZimmer());
		builder.append("]");
		return builder.toString();
	}

}
