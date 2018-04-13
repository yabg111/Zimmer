package User;

import java.util.Date;

public class User {

	private String listName = null;
	private String firstName = null;
	private Date dateOfBrith = null;
//	private Sex sex;
	private String email  = null;
	private String phoneNamber = null;
	private String address	 = null;
	
	private Account account = null;

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(Date dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNamber() {
		return phoneNamber;
	}

	public void setPhoneNamber(String phoneNamber) {
		this.phoneNamber = phoneNamber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [listName=");
		builder.append(listName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", dateOfBrith=");
		builder.append(dateOfBrith);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phoneNamber=");
		builder.append(phoneNamber);
		builder.append(", address=");
		builder.append(address);
		builder.append(", account=");
		builder.append(account);
		builder.append("]");
		return builder.toString();
	}
	
	
 
}
