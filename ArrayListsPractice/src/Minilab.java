import java.util.ArrayList;
public class Minilab {
	public static void main(String[] args) {	
		/*ArrayList<Integer> factor = new ArrayList<Integer>();
		factor.add(4);
		factor.add(5);
		factor.add(7);
		factor.add(6);
		keepOnlyCompositeNumbers(factor);
		*/
		//System.out.print(getListOfFactors(762));
		
	}
	public static ArrayList<Integer> getListOfFactors(int number)
	  {             
		ArrayList<Integer> factor = new ArrayList<Integer>();
		for (int i=2;i<number;i++) {
			if(number%i==0) {
				factor.add(i);
			}
		}
		return factor;
	  }
	 
	  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
	  {
		  int count=0;
			for (int i=0;i<nums.size();i++) {
				for(int j=2;j<nums.get(i);j++) {
				if(nums.get(i)%j==0) {
					count+=1;
				}
			}
				if(count<1) {
					nums.remove(i);
					i--;	
				}
				count=0;
		  }
	   System.out.print(nums);
	  }
}


