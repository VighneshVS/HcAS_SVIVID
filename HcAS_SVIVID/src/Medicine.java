import java.util.Scanner;

public class Medicine {
	Scanner scan = new Scanner(System.in);
	private String medicine;
	private int morning;
	private int noon;
	private int night;
	
	Medicine(String medicine, int morning, int noon, int night){
		this.medicine = medicine;
		this.morning = morning;
		this.noon = noon;
		this.night = night;
	}
	
	public void printMed(){
		System.out.println(medicine+" "+morning+"-"+noon+"-"+night);
	}
	
	public String getMedicineName() {
		return medicine;
	}
	
	public int getMorning() {
		return morning;
	}
	
	public int getNoon() {
		return noon;
	}
	
	public int getNight() {
		return night;
	}
}
