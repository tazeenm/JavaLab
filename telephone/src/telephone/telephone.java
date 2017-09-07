package telephone;

import java.util.*;
import java.io.*;

class MissedPhone 
{
	String name, phoneNo, time;

	MissedPhone(String n, String p, String t)
	{
		name = n;
		phoneNo = p;
		time = t;
	}

	public String toString()
	{
		return "\nName: " + name + "\nPhone No: " + phoneNo + "\nTime: " + time;
	}
}

class Phone
{
	int key;
	String name_a, phoneNo_a;

	Phone(int k, String n, String p)
	{
		key = k;
		name_a = n;
		phoneNo_a = p;
	}
}

class telephone
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		ArrayList<Phone> alist = new ArrayList<Phone>();
		ArrayList<MissedPhone> mlist = new ArrayList<MissedPhone>();
		alist.add(new Phone(1, "ABC", "1234"));
		alist.add(new Phone(2, "DEF", "5678"));
		alist.add(new Phone(3, "GHI", "9012"));
		alist.add(new Phone(4, "JKL", "3456"));
		alist.add(new Phone(5, "Private", "7890"));
		alist.add(new Phone(6, "Private", "1357"));
		alist.add(new Phone(7, "Private", "2468"));

		while(true)
		{
			System.out.println("\n1) Add\n2) Log\n3) Delete\n4) Exit: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				if(count > 10)
				{
					mlist.remove(0);
					count--;
				}
				Random rand = new Random();
				int num1 = rand.nextInt(7);
				Phone obj1 = alist.get(num1);
				int H = c.get(Calendar.HOUR);
				int M = c.get(Calendar.MINUTE);
				int S = c.get(Calendar.SECOND);
				String time1 = H + ":" + M + ":" + S;
				mlist.add(new MissedPhone(obj1.name_a, obj1.phoneNo_a, time1));
				count++;
				break;

				case 2:
				for(int i = 0; i < mlist.size(); i++)
				{
					MissedPhone obj2 = mlist.get(i);
					System.out.println("\nName: " + obj2.name + "\nPhone No: " + obj2.phoneNo + "\nTime: " + obj2.time);
					System.out.println("\n1) Display next\n2) Display next and delete current: ");
					int ch1 = sc.nextInt();
					switch(ch1)
					{
						case 1:
						continue;

						case 2:
						mlist.remove(i);
						i--;
						count--;
						continue;
					}
				}
				break;

				case 3:
				System.out.println("\nEnter number to delete: ");
				Scanner sc1 = new Scanner(System.in);
				String delNum = sc1.nextLine();
				for(int i = 0; i < mlist.size(); i++)
				{
					MissedPhone obj2 = mlist.get(i);
					if(obj2.phoneNo.equals(delNum))
					{
						mlist.remove(i);
						count--;
						System.out.println("Deleted! (" + delNum + ")");
					}
				}
				break;

				case 4:
				System.exit(0);
			}
		}
	}
}