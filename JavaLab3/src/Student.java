import java.util.Scanner;

public interface Student {
	void getName();
    void getBranch();
}

class Student_Details implements Student {

    Scanner in  = new Scanner(System.in);
    @Override
    public void getName() {
        // TODO Auto-generated method stub
        String name = " ";
        System.out.println("Enter name");
        name = in.nextLine();
        System.out.println("Name of the Student is :"+ name);
    }

    @Override
    public void getBranch() {
        // TODO Auto-generated method stub
        String branch = " ";
        System.out.println("Enter branch");
        branch = in.nextLine();
        System.out.println("Branch of the Student is :"+ branch);
        
    }
}
