package assesment_9_12;

import java.util.Scanner;

public class matrix_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  number of rows:");
		int rows= sc.nextInt();
		System.out.println("enter  number of columns:");
		int col= sc.nextInt();
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int m[][]=new int[10][10];
		for (int i = 1; i <= rows; ++i) {
		      for (int j = 1; j <= col; ++j) {
		    	 
		  		System.out.println("enter  value of a:");
		  		int val= sc.nextInt();
		  		a[i][j]=val;
		  		
		  		
		      }
		      System.out.println(" ");
		       
		      }
		for (int i = 1; i <= rows; ++i) {
		      for (int j = 1; j <= col; ++j) {
		    	 
		  		System.out.println("enter  value of b:");
		  		int val= sc.nextInt();
		  		b[i][j]=val;
		  		
		  		
		      }
		      System.out.println(" ");
		       
		      }
		//addition
		
  	
  	System.out.println("addition of matrix a and b is  ");
		      
		for (int i = 1; i <= rows; ++i) {
		      for (int j = 1; j <= col; ++j) {
		    
		    	  c[i][j]=a[i][j]+b[i][j];	
		    	  System.out.print(c[i][j]+"  ");
		      }
		      System.out.println("");
		       }
//multiplication
		System.out.println("multiplication of matrix a and b is  ");
		
		for (int i = 1; i <= rows; ++i) {
		      for (int j = 1; j <= col; ++j) {
		    	  
		    	  for (int k = 1;k<= rows; ++k)
		    	  {
		    		m[i][j]+=a[i][k]*b[k][j] ; 
		    	  }
		    	  System.out.print(m[i][j]+"  ");

		       }
		      System.out.println("");
}
}
}
