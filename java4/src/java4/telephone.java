package java4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

class MissedPhone {
	String name, phNo, time;
	MissedPhone(String n, String p, String t) {
		name = n;
		phNo = p;
		time = t;
	}
	public String toString() {
		return "Name : " + name + "Number : " + phNo + "Time : " + time;
	}
}

class Phone {
	String name_m, phNo_m;
	int key;
	Phone(int k, String n, String p) {
		key = k;
		name_m = n;
		phNo_m = p;
	}
}

public class telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int ch;
		Calendar c = Calendar.getInstance();
		ArrayList<Phone> aList = new ArrayList<Phone>();
		ArrayList<MissedPhone> mList = new ArrayList<MissedPhone>();
		
		aList.add(new Phone(1,"ABC","123"));
		aList.add(new Phone(2,"DEF","456"));
		aList.add(new Phone(3,"GHI","789"));
		aList.add(new Phone(4,"JKL","13454"));
		aList.add(new Phone(5,"MNO","1321"));
		aList.add(new Phone(6,"Private","2543"));
		aList.add(new Phone(7,"Private","6735"));
		aList.add(new Phone(8,"Private","3542"));
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Add\n2.Log\n3.Delete\n4.Exit\n");
			ch = in.nextInt();
			switch(ch) {
				case 1:
					if(count > 10) {
						mList.remove(0);
						count--;
					}
					Random r = new Random();
					int num = r.nextInt(8);
					Phone obj1 = aList.get(num);
					int H = c.get(Calendar.HOUR);
					int M = c.get(Calendar.MINUTE);
					int S = c.get(Calendar.SECOND);
					String time1 = H + ":" + M +":" + S;
					mList.add(new MissedPhone(obj1.name_m, obj1.phNo_m, time1));
					count++;
					break;
				case 2:
					for(int i=0; i<mList.size(); i++) {
						MissedPhone obj2 = mList.get(i);
						System.out.println("Name :" + obj2.name + "Phone :" + obj2.phNo + "Time :" + obj2.time);
						System.out.println("1.Display Next\n2.Display next and Delete Current\n");
						int ch1 = in.nextInt();
						switch(ch1) {
						case 1:
							continue;
						case 2:
							mList.remove(i);
							i--;
							count--;
							continue;
						}
					}
					break;
				case 3:
					System.out.println("Enter the number you want to delete");
					String delNum = in.nextLine();
					for(int i=0; i<mList.size(); i++) {
						MissedPhone obj3 = mList.get(i);
						if(obj3.phNo.equals(delNum)) {
							mList.remove(i);
							count--;
							System.out.println("Deleted " + delNum);
						}
					}
					break;
				case 4:
					System.exit(0);
			}
		}
	}

}
