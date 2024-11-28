import java.time.LocalTime;
import java.util.ArrayList;

public class DoctorDetails {
private int docId;
private String docName;
private String specialization;
private boolean availability;
private LocalTime startTime;
private LocalTime endTime;

	DoctorDetails(int docId, String docName, String specialization, boolean availability, LocalTime startTime, LocalTime endTime){
		this.docId = docId;
		this.docName = docName;
		this.specialization = specialization;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	ArrayList<LocalTime> appointments = new ArrayList<>();
	
	public void setAppointment(LocalTime time) {
		appointments.add(time);
	}
	
	public void getAppointments() {
		for(int i=0; i<appointments.size(); i++) {
			System.out.println(appointments.get(i));
		}
	}
	
	public String getDocName() {
		return this.docName;
	}
	public String getSpecialization() {
		return this.specialization;
	}
	public LocalTime getStartTime() {
		return this.startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public boolean getAvailability() {
		return availability;
	}
}
