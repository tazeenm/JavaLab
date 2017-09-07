
public abstract class Vehicle {
	 int year_of_manafacture;
	    
	    abstract void putData();
	    abstract int getData();
	    
	    public Vehicle() {
	        year_of_manafacture = 0;
	    }
}

class TwoWheeler extends Vehicle {
    
    @Override
    void putData() {
        // TODO Auto-generated method stub
        year_of_manafacture = 2000;
        
    }

    @Override
    int getData() {
        // TODO Auto-generated method stub
        return year_of_manafacture;
    }

}

final class FourWheeler extends Vehicle {
    
    @Override
    void putData() {
        // TODO Auto-generated method stub
        year_of_manafacture = 2015;
        
    }

    @Override
    int getData() {
        // TODO Auto-generated method stub
        return year_of_manafacture;
    }

}


