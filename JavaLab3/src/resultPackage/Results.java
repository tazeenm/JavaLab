package resultPackage;
import java.util.Scanner;

	public class Results {
	    public int[] credits = new int[5];
	    int[] grades = new int[5];
	    double result;
	    public static int TotalCredits;
	    int[] total = new int[5];
	    public double sum = 0;
	    
	    Scanner scan = new Scanner(System.in);
	    
	    //RegisterStudent r = new RegisterStudent();
	    
	    public void getCredits() {
	    	System.out.println("Enter the credits :");
	    	for(int i=0; i<5; i++) {
	    		credits[i] = scan.nextInt();
	            TotalCredits = TotalCredits + credits[i];
	        }
	    	System.out.println("Total Credits :" + TotalCredits);
	    }
	    
	    public void getGrades() {
	        System.out.println("Enter grades: S - 10, A - 9, B - 8, C - 7, D - 6, E - 5, F - 0");
	        for(int i=0; i<5; i++) {
	            grades[i] = scan.nextInt();
	        }
	    }
	    
	    class InvalidCGPAException extends Exception {
	        InvalidCGPAException() { }
	    }
	    
	    public double calculateCGPA() {	        
	        for(int j=0; j<5; j++) {
	            total[j] = (credits[j] * grades[j]);
	        }
	        for(int j=0; j<5; j++) {
	            sum = sum + total[j];
	        }System.out.println(sum);
	        try {
	            result = sum/TotalCredits;
	            System.out.println("CGPA is :" + result);
	            if(result < 0) {
	                throw new NumberFormatException();
	            } else if(result > 10) {
	                throw new InvalidCGPAException();
	            }
	        } catch(NumberFormatException e) {
	            System.out.println("Invalid CGPA!");
	        } catch(InvalidCGPAException f) {
	            System.out.println("CGPA cannot be greater than 10");
	        }
	       return result; 
	    } 
	    
	} 
