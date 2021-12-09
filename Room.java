package assesment_9_12;

import java.util.Scanner;

public class Room {
	
	
	String roomarea;
	String Acmachine;
	int rno;
	String rtype;
	String rarea;
	String acmchin;
	Scanner sc = new Scanner(System.in);
	
	public void setdata() {
		System.out.println("enter roomno:");
		rno = sc.nextInt();
	}
	
	public void setdata1() {
		System.out.println("enter roomtype:");
		 rtype =sc.next();
		 
	}
	
	public void setdata2() {
		System.out.println("enter roomarea:");
		rarea = sc.next();
		
	}
	public  void setdata3() {

		System.out.println("enter Acmachine:");
		 acmchin=sc.next();
		
	}
		
	
	
	public void displaydata() {
		System.out.println("enter roomno is:"+rno);
		System.out.println("enter roomtype is:"+rtype);
		System.out.println("roomarea is:"+rarea);
		System.out.println("room Acmachine:"+acmchin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room();
		r.setdata();
		r.setdata1();
		r.setdata2();
		r.setdata3();
		r.displaydata();
			
			
		}

}


