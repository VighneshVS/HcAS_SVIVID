import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DocAppointment{
	Scanner scan = new Scanner(System.in);
	HashMap<String, DoctorDetails> docList = new HashMap<>();
	
	DocAppointment(){
		DoctorDetails doc1 = new DoctorDetails(001,"V Raja", "cardiology", true, LocalTime.of(9, 00), LocalTime.of(17, 00));
		docList.put("cardiology", doc1);
		DoctorDetails doc2 = new DoctorDetails(002,"Margabandhu", "urology", true, LocalTime.of(10, 00),LocalTime.of(16, 00));
		docList.put("urology", doc2);
		DoctorDetails doc3 = new DoctorDetails(003,"Dean", "neurology", true, LocalTime.of(11, 00),LocalTime.of(13, 00));
		docList.put("neurology", doc3);
		DoctorDetails doc4 = new DoctorDetails(004, "Paapu", "paediatrician", true, LocalTime.of(17, 00),LocalTime.of(20, 00));
		docList.put("paediatrician", doc4);
	}	
	
	
	
	public HashMap<String, DoctorDetails> getDocList(){
		return docList;
	} 
	
	
	
	
		/*if(docVisited == doc1.getDocName()) {
			System.out.println("Timing of the appointment (HH): ");
			int hh = scan.nextInt();
			System.out.println("Timing of the appointment (MM): ");
			int mm = scan.nextInt();
			LocalTime time = LocalTime.of(hh, mm);
			if(time.isAfter(doc1.getStartTime()) && time.isBefore(doc1.getEndTime()) && doc1.getAvailability() == true) {
				System.out.println("Appointment confirmed. Please be at the Hospital 15 minutes prior to the time of appointment.Thank you.");
			}
		}
		if(docVisited == doc2.getDocName()) {
			System.out.println("Timing of the appointment (HH): ");
			int hh = scan.nextInt();
			System.out.println("Timing of the appointment (MM): ");
			int mm = scan.nextInt();
			LocalTime time = LocalTime.of(hh, mm);
			if(time.isAfter(doc2.getStartTime()) && time.isBefore(doc2.getEndTime()) && doc2.getAvailability() == true) {
				System.out.println("Appointment confirmed. Please be at the Hospital 15 minutes prior to the time of appointment.Thank you.");
			}
		}
		
		if(docVisited == doc3.getDocName()) {
			System.out.println("Timing of the appointment (HH): ");
			int hh = scan.nextInt();
			System.out.println("Timing of the appointment (MM): ");
			int mm = scan.nextInt();
			LocalTime time = LocalTime.of(hh, mm);
			if(time.isAfter(doc3.getStartTime()) && time.isBefore(doc3.getEndTime()) && doc3.getAvailability() == true) {
				System.out.println("Appointment confirmed. Please be at the Hospital 15 minutes prior to the time of appointment.Thank you.");
			}
		}
		
		if(docVisited == doc4.getDocName()) {
			System.out.println("Timing of the appointment (HH): ");
			int hh = scan.nextInt();
			System.out.println("Timing of the appointment (MM): ");
			int mm = scan.nextInt();
			LocalTime time = LocalTime.of(hh, mm);
			if(time.isAfter(doc4.getStartTime()) && time.isBefore(doc4.getEndTime()) && doc4.getAvailability() == true) {
				System.out.println("Appointment confirmed. Please be at the Hospital 15 minutes prior to the time of appointment.Thank you.");
			}
		}*/
	
	

	
	
	
	
	//String prevHist = previousDocVisited();
}
