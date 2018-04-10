package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;
/**
 * @author  טבלה זו מכילה את רשימת הספקים ואת סוג הציוד, אותו הם מספקים.
 * @since 04/04/18
 * @page 122 {@code: 2.5.3.19}
 */
public class SuppliersInventory {
	private Integer Supplier_Numberr = null;
	private Integer Inventory_Numberr = null;
	public Integer getSupplier_Numberr() {
		return Supplier_Numberr;
	}
	public void setSupplier_Numberr(Integer supplier_Numberr) {
		Supplier_Numberr = supplier_Numberr;
	}
	public Integer getInventory_Numberr() {
		return Inventory_Numberr;
	}
	public void setInventory_Numberr(Integer inventory_Numberr) {
		Inventory_Numberr = inventory_Numberr;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuppliersInventory [Supplier_Numberr=");
		builder.append(Supplier_Numberr);
		builder.append(", Inventory_Numberr=");
		builder.append(Inventory_Numberr);
		builder.append("]");
		return builder.toString();
	}
	
	
}
