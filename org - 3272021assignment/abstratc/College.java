package org.abstratc;


public class College extends University{
	
	public void ug()
	{
		System.out.println("Ug course on ECE");
	}
	
	public static void main(String[] args) {

		College details = new College();
		details.pg();
		details.ug();
	}

}