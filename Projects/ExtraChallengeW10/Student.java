
public class Student {
	
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;
	private double fee;
	
	public Student(String aStudentNumber, String aStudentName) {
		studentNumber = aStudentNumber;
		studentName = aStudentName;
		
		//setting up a sensible value in order to not be ambiguous
		markForMaths = -1;
		markForEnglish = -1;
		markForScience = -1;
		
		fee = 750;
	}
	
	public String getNumber() {
		return studentNumber;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void enterMarks(int aMarkForMaths, 
						int aMarkForEnglish, int aMarkForScience) {
		
		markForMaths = aMarkForMaths;
		markForEnglish = aMarkForEnglish;
		markForScience = aMarkForScience;						
	}
	
	public int getMathsMark() {
		return markForMaths;
	}
	
	public int getEnglishMark() {
		return markForEnglish;
	}
	
	public int getScienceMark() {
		return markForScience;
	}
	
	public double calculateAverageMark() {
		//in order to make sure the division result is a double
		double avg = (markForMaths + markForEnglish + markForScience) / 3.0;
		return avg;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(double aFee) {
		fee = aFee;
	}
}
