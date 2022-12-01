package arrays;

import java.util.ArrayList;

public class ListExemple {
	
	// declaration
	ArrayList<Integer> numlist=new ArrayList<Integer>();
	public void initialise()
	{
		
		numlist.add(1);
		numlist.add(4);
	}
	public ArrayList<Integer> getNumlist() {
		return numlist;
	}
	public void setNumlist(ArrayList<Integer> numlist) {
		this.numlist = numlist;
	}
	public ListExemple(ArrayList<Integer> numlist) {
		super();
		this.numlist = numlist;
	}
	public ListExemple() {
		// TODO Auto-generated constructor stub
	}

}
