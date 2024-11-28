import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		String response ="Yes";
		Scanner scan = new Scanner(System.in);
		HashMap<String, PatientDetails> patientList = new HashMap<>();
		
		while(response == "Yes") {
			System.out.println("Welcome to SVIVID Hospitals!");
			System.out.println("-------------Appointment Generation-------------");
		
			System.out.println("Please enter your mobile no: ");
			String phNo = scan.next();
		
			PatientDetails currentPatient;
		
		
			if(patientList.containsKey(phNo)) {
				currentPatient = patientList.get(phNo);
				System.out.println(currentPatient.getPatientID());
				System.out.println(currentPatient.getPatientName());
				System.out.println(currentPatient.getAge());
				System.out.println(currentPatient.getGender());
				System.out.println(currentPatient.getMedHis());
				System.out.println("Medicines in prev prescription");
				for(int i=0; i<currentPatient.prescription.size(); i++) {
					currentPatient.prescription.get(i).printPres();
				}
				
			}else {
				PatientDetails patientDeets = new PatientDetails();
			
				patientDeets.generateID();
				System.out.println("New ID: "+patientDeets.getPatientID());
			
				System.out.println("Enter your name:\t");
				String name = scan.next(); 
				patientDeets.setName(name);
			
				System.out.println("Enter your age:\t");
				int age = scan.nextInt();
				patientDeets.setAge(age);
			
				System.out.println("Enter your gender:\t");
				String gender = scan.next();
				patientDeets.setGender(gender);
				
			
				patientList.put(phNo, patientDeets);
				//System.out.println(patientList.values());
				
				currentPatient = patientDeets;
				System.out.println("Please mention if allergic to any: ");
				currentPatient.medicalHistory(scan.nextLine());
			}
		
			DocAppointment docDeets = new DocAppointment();
			HashMap<String, DoctorDetails> doctorList = docDeets.getDocList();
	
			
			String appointment = "pending";
			String field = "";
			String currentDoctor = null;
			while(true) {
				System.out.println();
				System.out.println("Enter the field of Consultion:");
				field = scan.next();
				field = field.toLowerCase();
				if(doctorList.containsKey(field)) {
//				currentDoctor = docDeets.getDocList().get(field).getDocName();
					LocalTime appointmentTiming = null;
					while(appointment == "pending") {
						System.out.println("The doctor you'll be seeing is Dr."+doctorList.get(field).getDocName());
						System.out.println("Timing of the appointment (HH): ");
						int hh = scan.nextInt();
						System.out.println("Timing of the appointment (MM): ");
						int mm = scan.nextInt();
						LocalTime time = LocalTime.of(hh, mm);
						doctorList.get(field).setAppointment(time);
						if(time.isAfter( doctorList.get(field).getStartTime()) && time.isBefore(doctorList.get(field).getEndTime())){
							System.out.println("Appointment confirmed. Please be at the Hospital 15 minutes prior to the time of appointment.Thank you.");
							break; 
						}else {
							System.out.println("The doctor is available only between "+doctorList.get(field).getStartTime()+" and "+doctorList.get(field).getEndTime());
						}
					}
				break;
			}else {
				System.out.println("Please choose a field from the below");
				System.out.println("Cardiology");
				System.out.println("Neurology");
				System.out.println("Urology");
				System.out.println("Paediatrician");
			}
			}
			
			System.out.println();
			System.out.println("Upcoming appointments: ");
			doctorList.get(field).getAppointments();
			
			System.out.println();
			System.out.println("Medicine Entry:");
			Prescription prescription = new Prescription();
			while(true) {
					System.out.println("Medicine: ");
					String para = scan.next();
					System.out.println("Morning: ");
					int mrng = scan.nextInt();
					System.out.println("Noon: ");
					int noon = scan.nextInt();
					System.out.println("Night: ");
					int night = scan.nextInt();
		
					Medicine medicine = new Medicine(para,mrng,noon,night);
					
					prescription.addMed(medicine);
		
		
					System.out.println("Next?");
					String ans = scan.next();
					
					if(ans.equalsIgnoreCase("yes")) {
						System.out.println(ans);
						
					}else {
						break;
					}
			}
			currentPatient.prescription.add(prescription);
			
			System.out.println("Do you want to continue?");
			String ans = scan.next();
			
			if(ans.equalsIgnoreCase("yes")) {
				
			}
			else {
				System.out.println("END");
				break;
			}
		}
	
	}

}
