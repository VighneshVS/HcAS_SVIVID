import java.util.*;

public class Prescription {
	Scanner scan = new Scanner(System.in);

	ArrayList<Medicine> medicineList = new ArrayList<>();
	
	public void addMed(Medicine medicine){
		this.medicineList.add(medicine);
	}
	
	public void printPres(){
		for(int i=0; i<medicineList.size(); i++) {
			medicineList.get(i).printMed();
		}
		
	}
//	
	
	/*Medicine para = new Medicine("Paracetamol", true, false, true);	
	Medicine ben = new Medicine("Benadryl", false, false, true);
	Medicine wik = new Medicine("Wikoryl", false, false, true);
	Medicine kl = new Medicine("Kangaroo Lekkiyam", true, false, false);
	
	public void getMedicine() {
		int i=0;
		while(i==0) {
			System.out.println("Enter the medicine: ");
			String medicineName = scan.nextLine();
			if(medicineName == para.getMedicineName()) {
				boolean morning = para.getMorning();
				boolean noon = para.getNoon();
				boolean night = para.getNight();
			}
			if(medicineName == ben.getMedicineName()) {
				boolean morning = ben.getMorning();
				boolean noon = ben.getNoon();
				boolean night = ben.getNight();
			}
		
			if(medicineName == wik.getMedicineName()) {
				boolean morning = wik.getMorning();
				boolean noon = wik.getNoon();
				boolean night = wik.getNight();
			}
		
			if(medicineName == kl.getMedicineName()) {
				boolean morning = kl.getMorning();
				boolean noon = kl.getNoon();
				boolean night = kl.getNight();
			}
			System.out.println("Next?");
			String response = scan.next();
			if(response == "Yes") {
				continue;
			}else {
				break;
			}
		}
	}*/
	
	
//	public void prescriptionDetails() {
//		System.out.println("Enter the medicine prescribed by the doc: ");
//		String medicineName = scan.nextLine();
//		boolean morning;
//		boolean noon;
//		boolean night;
//		
//		if(medicineName == this.medicine) {
//			morning = this.morning;
//			noon = this.noon;
//			night = this.night;
//		}
		
		
		
	
	
	
}
