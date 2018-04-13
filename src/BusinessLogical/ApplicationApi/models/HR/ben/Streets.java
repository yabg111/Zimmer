package BusinessLogical.ApplicationApi.models.HR.ben;

/**
 * @author טבלה זו מכילה את רשימת הרחובות
 * @since 04/04/18
 * @page 121 {@code: 2.5.3.16}
 */
public class Streets {
	private Integer Street_ID = null;
	private String Street_Name = null;
	private Integer Country_ID = null;
	private Integer City_ID = null;

	private Streets streets;
	
	public Integer getStreet_ID() {
		return Street_ID;
	}

	public void setStreet_ID(Integer street_ID) {
		Street_ID = street_ID;
	}

	public String getStreet_Name() {
		return Street_Name;
	}

	public void setStreet_Name(String street_Name) {
		Street_Name = street_Name;
	}

	public Integer getCountry_ID() {
		return Country_ID;
	}

	public void setCountry_ID(Integer country_ID) {
		Country_ID = country_ID;
	}

	public Integer getCity_ID() {
		return City_ID;
	}

	public void setCity_ID(Integer city_ID) {
		City_ID = city_ID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Streets [Street_ID=");
		builder.append(Street_ID);
		builder.append(", Street_Name=");
		builder.append(Street_Name);
		builder.append(", Country_ID=");
		builder.append(Country_ID);
		builder.append(", City_ID=");
		builder.append(City_ID);
		builder.append("]");
		return builder.toString();
	}

}
