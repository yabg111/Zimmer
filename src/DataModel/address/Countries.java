package DataModel.address;

/**
 * @author טבלה זו מכילה את רשימת הערים
 * @since 02/04/18
 * @page 112 {@code: 2.5.3.2}
 */
public class Countries {
	private Integer countryID = null;
	private String countryName = null;

	public Integer getCountryID() {
		return countryID;
	}

	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Countries [countryID=");
		builder.append(countryID);
		builder.append(", countryName=");
		builder.append(countryName);
		builder.append("]");
		return builder.toString();
	}

}
