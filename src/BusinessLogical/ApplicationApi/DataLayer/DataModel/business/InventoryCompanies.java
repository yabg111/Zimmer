package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

/**
 * @author  טבלה זו מכילה את החברות העובדות עם הספקים שמספקים מלאי לצימר .
 * @since 02/04/18
 * @page 117 {@code: 2.5.3.9}
 */
public class InventoryCompanies {
	private Integer companyID = null;
	private String companyName = null;

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InventoryCompanies [companyID=");
		builder.append(companyID);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", getCompanyID()=");
		builder.append(getCompanyID());
		builder.append(", getCompanyName()=");
		builder.append(getCompanyName());
		builder.append("]");
		return builder.toString();
	}

}
