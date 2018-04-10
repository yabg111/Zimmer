package DataModel.business;
/**
 * @author טבלה זו מכילה את נתוני הצימר.
 * @since 04/04/18
 * @page 122 {@code: 2.5.3.21}
 */
public class Zimmer {
	private Integer Zimmer_Number = null;
	private Integer Zimmer_Name = null;
	private Integer Rooms_Quantity = null;
	private Integer Stars = null;
	private Boolean With_Jacuzzi = null;
	public Integer getZimmer_Number() {
		return Zimmer_Number;
	}
	public void setZimmer_Number(Integer zimmer_Number) {
		Zimmer_Number = zimmer_Number;
	}
	public Integer getZimmer_Name() {
		return Zimmer_Name;
	}
	public void setZimmer_Name(Integer zimmer_Name) {
		Zimmer_Name = zimmer_Name;
	}
	public Integer getRooms_Quantity() {
		return Rooms_Quantity;
	}
	public void setRooms_Quantity(Integer rooms_Quantity) {
		Rooms_Quantity = rooms_Quantity;
	}
	public Integer getStars() {
		return Stars;
	}
	public void setStars(Integer stars) {
		Stars = stars;
	}
	public Boolean getWith_Jacuzzi() {
		return With_Jacuzzi;
	}
	public void setWith_Jacuzzi(Boolean with_Jacuzzi) {
		With_Jacuzzi = with_Jacuzzi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Zimmer [Zimmer_Number=");
		builder.append(Zimmer_Number);
		builder.append(", Zimmer_Name=");
		builder.append(Zimmer_Name);
		builder.append(", Rooms_Quantity=");
		builder.append(Rooms_Quantity);
		builder.append(", Stars=");
		builder.append(Stars);
		builder.append(", With_Jacuzzi=");
		builder.append(With_Jacuzzi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
