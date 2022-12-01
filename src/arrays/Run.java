package arrays;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExemple le=new ListExemple();
		le.initialise();
		System.out.println(le.numlist.get(1));
		for(int num : le.numlist)
		{
			System.out.println("valeur "+num);
			
		}
			
	}

}
