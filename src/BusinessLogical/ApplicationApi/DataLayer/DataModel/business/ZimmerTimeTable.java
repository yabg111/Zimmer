package BusinessLogical.ApplicationApi.DataLayer.DataModel.business;

import java.util.Date;

/**
 * @author טבלה זו מכילה את נתוני הצימר.
 * @since 04/04/18
 * @page 122 {@code: 2.5.3.22}
 */
public class ZimmerTimeTable {
	private Integer Zimmer_Number = null;
	private Date Zimmer_Using_Start_Date = null;
	private Date Zimmer_Using_End_Date = null;
	private Integer Vacation_Number = null;
	public Integer getZimmer_Number() {
		return Zimmer_Number;
	}
	public void setZimmer_Number(Integer zimmer_Number) {
		Zimmer_Number = zimmer_Number;
	}
	public Date getZimmer_Using_Start_Date() {
		return Zimmer_Using_Start_Date;
	}
	public void setZimmer_Using_Start_Date(Date zimmer_Using_Start_Date) {
		Zimmer_Using_Start_Date = zimmer_Using_Start_Date;
	}
	public Date getZimmer_Using_End_Date() {
		return Zimmer_Using_End_Date;
	}
	public void setZimmer_Using_End_Date(Date zimmer_Using_End_Date) {
		Zimmer_Using_End_Date = zimmer_Using_End_Date;
	}
	public Integer getVacation_Number() {
		return Vacation_Number;
	}
	public void setVacation_Number(Integer vacation_Number) {
		Vacation_Number = vacation_Number;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ZimmerTimeTable [Zimmer_Number=");
		builder.append(Zimmer_Number);
		builder.append(", Zimmer_Using_Start_Date=");
		builder.append(Zimmer_Using_Start_Date);
		builder.append(", Zimmer_Using_End_Date=");
		builder.append(Zimmer_Using_End_Date);
		builder.append(", Vacation_Number=");
		builder.append(Vacation_Number);
		builder.append("]");
		return builder.toString();
	}
	
	
}
