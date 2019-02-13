import java.util.ArrayList;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> mylist = new ArrayList <Integer>();
	
		mylist.add(42);
		mylist.add(507);
		mylist.add(24);
		//mylist.set(1,52);
		//mylist.add(1,52);
		//mylist.remove(1);
		//System.out.println(mylist);
		for (int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		for (Integer num: mylist)
		{
			System.out.println(num);
		}
		
		
	}
	
	
}

