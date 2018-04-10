package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

import java.util.Date;

/**
 * @author טבלה זו מכילה את רשימת ההזמנות לצימר.
 * @since 04/04/18
 * @page 122 {@code: 2.5.3.20}
 */
public class Vacation {
	private Integer Vacation_Number = null;
	private String Vacation_Name = null;
	private String Vacation_Description = null;
	private Date Vacation_Start_Date = null;
	private Date Vacation_End_Date = null;
	private Integer Vacation_Price = null;
	public Integer getVacation_Number() {
		return Vacation_Number;
	}
	public void setVacation_Number(Integer vacation_Number) {
		Vacation_Number = vacation_Number;
	}
	public String getVacation_Name() {
		return Vacation_Name;
	}
	public void setVacation_Name(String vacation_Name) {
		Vacation_Name = vacation_Name;
	}
	public String getVacation_Description() {
		return Vacation_Description;
	}
	public void setVacation_Description(String vacation_Description) {
		Vacation_Description = vacation_Description;
	}
	public Date getVacation_Start_Date() {
		return Vacation_Start_Date;
	}
	public void setVacation_Start_Date(Date vacation_Start_Date) {
		Vacation_Start_Date = vacation_Start_Date;
	}
	public Date getVacation_End_Date() {
		return Vacation_End_Date;
	}
	public void setVacation_End_Date(Date vacation_End_Date) {
		Vacation_End_Date = vacation_End_Date;
	}
	public Integer getVacation_Price() {
		return Vacation_Price;
	}
	public void setVacation_Price(Integer vacation_Price) {
		Vacation_Price = vacation_Price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vacation [Vacation_Number=");
		builder.append(Vacation_Number);
		builder.append(", Vacation_Name=");
		builder.append(Vacation_Name);
		builder.append(", Vacation_Description=");
		builder.append(Vacation_Description);
		builder.append(", Vacation_Start_Date=");
		builder.append(Vacation_Start_Date);
		builder.append(", Vacation_End_Date=");
		builder.append(Vacation_End_Date);
		builder.append(", Vacation_Price=");
		builder.append(Vacation_Price);
		builder.append("]");
		return builder.toString();
	}
	
	
}
