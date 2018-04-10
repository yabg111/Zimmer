package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;
/**
 * @author טבלה זו מכילה את רשימת הספקים.
 * @since 04/04/18
 * @page 122 {@code: 2.5.3.18}
 */
public class Suppliers {
	private Integer Supplier_Number = null;
	private String Supplier_Name = null;
	private Integer City_ID = null;
	private Integer Street_ID = null;
	private String Email = null;
	public Integer getSupplier_Number() {
		return Supplier_Number;
	}
	public void setSupplier_Number(Integer supplier_Number) {
		Supplier_Number = supplier_Number;
	}
	public String getSupplier_Name() {
		return Supplier_Name;
	}
	public void setSupplier_Name(String supplier_Name) {
		Supplier_Name = supplier_Name;
	}
	public Integer getCity_ID() {
		return City_ID;
	}
	public void setCity_ID(Integer city_ID) {
		City_ID = city_ID;
	}
	public Integer getStreet_ID() {
		return Street_ID;
	}
	public void setStreet_ID(Integer street_ID) {
		Street_ID = street_ID;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Suppliers [Supplier_Number=");
		builder.append(Supplier_Number);
		builder.append(", Supplier_Name=");
		builder.append(Supplier_Name);
		builder.append(", City_ID=");
		builder.append(City_ID);
		builder.append(", Street_ID=");
		builder.append(Street_ID);
		builder.append(", Email=");
		builder.append(Email);
		builder.append("]");
		return builder.toString();
	}
	
	
}
