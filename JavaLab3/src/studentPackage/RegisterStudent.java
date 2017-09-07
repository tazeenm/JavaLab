package studentPackage;
import resultPackage.Results;

	public class RegisterStudent {
	    //Scanner scan = new Scanner(System.in);
	    
	    public void StudentRegistration() {
	    	//Results r2 = new Results();
	    	try {
	            if(Results.TotalCredits > 30) {
	            	//System.out.println("Check Credits!");
	                throw new CreditLimitException();
	            } 
	        }
	        catch(CreditLimitException e) {
	            System.out.println("Exception Caught! Credit Limit Reached");
	        }
	    }
	}
	    class CreditLimitException extends Exception {
    		CreditLimitException() { }
    	}
	

