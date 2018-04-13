package User;

import java.awt.Image;
import java.util.Date;

public class Account {

	private Date creationData = null;
	private Image proilPicture = null;
	private User user = null;
	public Date getCreationData() {
		return creationData;
	}
	public void setCreationData(Date creationData) {
		this.creationData = creationData;
	}
	public Image getProilPicture() {
		return proilPicture;
	}
	public void setProilPicture(Image proilPicture) {
		this.proilPicture = proilPicture;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [creationData=");
		builder.append(creationData);
		builder.append(", proilPicture=");
		builder.append(proilPicture);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	 
	
}
