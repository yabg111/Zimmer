package BusinessLogical.ApplicationApi.DataLayer.DataModel.address;
/**
 * @author טבלה זו מכילה את רשימת הערים
 * @since 02/04/18
 * @page 112  {@code: 2.5.3.1}
 */
public class Cities {
	// ID sql
	private Integer cityId = null;
	private Integer countyId = null;
	private String cityName = null;
 
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCountyId() {
		return countyId;
	}

	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cities [cityId=");
		builder.append(cityId);
		builder.append(", countyId=");
		builder.append(countyId);
		builder.append(", cityName=");
		builder.append(cityName);
		builder.append(", getCityId()=");
		builder.append(getCityId());
		builder.append(", getCountyId()=");
		builder.append(getCountyId());
		builder.append(", getCityName()=");
		builder.append(getCityName());
		builder.append("]");
		return builder.toString();
	}
}
