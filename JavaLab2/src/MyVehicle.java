
public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v2 = new TwoWheeler();
        Vehicle v4 = new FourWheeler();
        TwoWheeler mv2 = new myTwoWheeler();
        
        
        v2.putData();
        int wheel2 = v2.getData();
        System.out.println("Two Wheeler Vehicle was manafactured in " + wheel2);
        
        v4.putData();
        int wheel4 = v4.getData();
        System.out.println("Four Wheeler Vehicle was manafactured in " + wheel4);
        
        mv2.putData();
        int mywheel2 = mv2.getData();
        System.out.println("New Two Wheeler Vehicle was manafactured in " + mywheel2);
	}
}
