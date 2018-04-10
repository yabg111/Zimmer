package DataModel.person;
/**
 * @author טבלה זו מכילה את נותני השרות אותם ניתן להעסיק.
 * @since 04/04/18
 * @page 121 {@code: 2.5.3.17}
 */
public class SujestedWorkers {
	private Integer Worker_ID = null;	
	private String Worker_Name = null;	
	private Integer WorkerCity_ID = null;	
	private Integer Worker_Street_ID = null;	
	private Integer Worker_Phone = null;	
	private Integer Worker_Service_Type = null;	
	private Integer Worker_Wanted_Salary = null;
	public Integer getWorker_ID() {
		return Worker_ID;
	}
	public void setWorker_ID(Integer worker_ID) {
		Worker_ID = worker_ID;
	}
	public String getWorker_Name() {
		return Worker_Name;
	}
	public void setWorker_Name(String worker_Name) {
		Worker_Name = worker_Name;
	}
	public Integer getWorkerCity_ID() {
		return WorkerCity_ID;
	}
	public void setWorkerCity_ID(Integer workerCity_ID) {
		WorkerCity_ID = workerCity_ID;
	}
	public Integer getWorker_Street_ID() {
		return Worker_Street_ID;
	}
	public void setWorker_Street_ID(Integer worker_Street_ID) {
		Worker_Street_ID = worker_Street_ID;
	}
	public Integer getWorker_Phone() {
		return Worker_Phone;
	}
	public void setWorker_Phone(Integer worker_Phone) {
		Worker_Phone = worker_Phone;
	}
	public Integer getWorker_Service_Type() {
		return Worker_Service_Type;
	}
	public void setWorker_Service_Type(Integer worker_Service_Type) {
		Worker_Service_Type = worker_Service_Type;
	}
	public Integer getWorker_Wanted_Salary() {
		return Worker_Wanted_Salary;
	}
	public void setWorker_Wanted_Salary(Integer worker_Wanted_Salary) {
		Worker_Wanted_Salary = worker_Wanted_Salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SujestedWorkers [Worker_ID=");
		builder.append(Worker_ID);
		builder.append(", Worker_Name=");
		builder.append(Worker_Name);
		builder.append(", WorkerCity_ID=");
		builder.append(WorkerCity_ID);
		builder.append(", Worker_Street_ID=");
		builder.append(Worker_Street_ID);
		builder.append(", Worker_Phone=");
		builder.append(Worker_Phone);
		builder.append(", Worker_Service_Type=");
		builder.append(Worker_Service_Type);
		builder.append(", Worker_Wanted_Salary=");
		builder.append(Worker_Wanted_Salary);
		builder.append("]");
		return builder.toString();
	}

}
