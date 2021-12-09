package assesment_9_12;

import java.util.Scanner;

public class root_of_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  value of a:");
		 a = sc.nextInt();
			System.out.println("enter  the value of b:");
		 b= sc.nextInt();
		System.out.println("enter the valu of c:");
		 c = sc.nextInt();
     double d=b*b-(4*a*c);
     double x = Math.sqrt(d);
     if(d>0)
     {
    	double froot=(-b+x)/2*a;
    	 double sroot=(+b+x)/2*a;
    	 System.out.println(" root of ("+a+"x^2+"+b+"x+"+c+" =0) are ="+froot+"  and  "+sroot);
		 

     }
     else if(d==0){
     System.out.println(" root of "+a+"x^2+"+b+"x+"+c+ "is"+((-b+x)/2*a));
     }
	}

}
