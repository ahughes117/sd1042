
public class StudentTester {
	
	public static void main (String [] args) {
		final int STUDENTS = 5;
		
		Student [] students = new Student[STUDENTS];
		
		students[0] = new Student("1235441","Alex Hughes");
		students[1] = new Student("1126930","Jose Da Costa");
		students[2] = new Student("1234567","Mickey Mouse");
		students[3] = new Student("9876543","Antonio Robato");
		students[4] = new Student("4598791","Tzutzubem Tzutzubem");
		
		students[0].enterMarks(3, 2, 4);
		students[1].enterMarks(2, 2, 4);
		students[2].enterMarks(3, 2, 1);
		students[3].enterMarks(1, 2, 3);
		students[4].enterMarks(5, 5, 5);
		
		for (int i=0; i<STUDENTS; i++) {
			System.out.println("\nStudent: " + students[i].getNumber() + " - " 
			+ students[i].getName() + " has the following marks:");
			
			System.out.println("Maths Mark: " + students[i].getMathsMark());
			System.out.println("English Mark: " + students[i].getEnglishMark());
			System.out.println("Science Mark: " + students[i].getScienceMark());
			System.out.println("AVERAGE: " + students[i].calculateAverageMark());
		}
	}
}
