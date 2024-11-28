import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PatientDetails{

private String patientName;
private int age;
private String gender;
private String medicalHistory;
private int patientID;


ArrayList<Prescription> prescription = new ArrayList<>();
	
	public void generateID() {
		Random random = new Random();
		this.patientID = random.nextInt(100);
	}
	public void setName(String patientName) {
		this.patientName = patientName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void medicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	
	public int getPatientID() {
		return patientID;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getMedHis() {
		return medicalHistory;
	}
	
	
	
	
	
	

}
