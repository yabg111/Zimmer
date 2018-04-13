package DataModel;
/**
 * @author ישוית
 * @since 02/04/18
 * @page 112  {@code: 2.5.3.1}
 */
public enum Entities {
	
	DIRECTOR("DIRECTOR","E1",1),//מנהל צימר
	CPA("CPA","E2",2),//רואה חשבון
	AUTOMATIC_BANK_SERVICES("AUTOMATIC_BANK_SERVICES","E3",3),//שרותי בנק אוטומטיים
	SERVICES_BANK("SERVICES_BANK","E4",4),//שרותי בנק
	PROVIDER("PROVIDER","E5",5),//ספק
	SERVICE_PROVIDER("SERVICE_PROVIDER","E6",6),//נותן שרות
	EMPLOYEES("EMPLOYEES","E7",7),//עובדים
	RESPONSIBLE_EMPLOYEES_AND_HUMAN_RESOURCES ("RESPONSIBLE_EMPLOYEES_AND_HUMAN_RESOURCES","E8",8),//    אחראי עבודה ומשאבי אנוש
	PURCHASING_INVENTORY_MANAGER ("PURCHASING_INVENTORY_MANAGER","E9",9);// אחראי רכש ומלאי
	
	
	private String name;
	private String codeType;
	private int code;

	private Entities(String name,String codeType,int code) {
		this.name=name;
		this.codeType=codeType;
		this.code=code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
 
	
	
}
