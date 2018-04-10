package DataModel.business;

/**
 * @author טבלה זו מכילה את סוגה ה שרות
 * @since 04/04/18
 * @page 120 {@code: 2.5.3.15}
 */
public class ServiceType {
	private Integer serviceType = null;
	private String serviceName = null;

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceType [serviceType=");
		builder.append(serviceType);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append("]");
		return builder.toString();
	}

}
