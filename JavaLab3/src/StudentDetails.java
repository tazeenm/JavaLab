import resultPackage.Results;
import studentPackage.RegisterStudent;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sem1=0;
		double sem2=0;
		double sem3=0;
		double sem4=0;
		double AverageCGPA = 0;
		
		 	Student_Details s1 = new Student_Details();
	        RegisterStudent rs = new RegisterStudent();
	        Results r1 = new Results();
	        
	        s1.getName();
	        s1.getBranch();
	     
	        r1.getCredits();
	        rs.StudentRegistration();
	        r1.getGrades();
	        sem1 = r1.calculateCGPA();
	        Results.TotalCredits = 0;
	        r1.sum = 0;
	        
	        r1.getCredits();
	        rs.StudentRegistration();
	        r1.getGrades();
	        sem2 = r1.calculateCGPA();
	        Results.TotalCredits = 0;
	        r1.sum = 0;
	        
	        r1.getCredits();
	        rs.StudentRegistration();
	        r1.getGrades();
	        sem3 = r1.calculateCGPA();
	        Results.TotalCredits = 0;
	        r1.sum = 0;
	        
	        r1.getCredits();
	        rs.StudentRegistration();
	        r1.getGrades();
	        sem4 = r1.calculateCGPA();
	        Results.TotalCredits = 0;
	        r1.sum = 0;
	        
	        AverageCGPA = (sem1+sem2+sem3+sem4)/4;
	        System.out.println("CGPA for 4 semesters :"+AverageCGPA);
	       
	}
}
