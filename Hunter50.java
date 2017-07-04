package guviworkspace;

import java.util.Scanner;

public class Hunter50 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int i;
	for( i=a;i>=0;){
	     if(i>=b){
				i=i-b;
			}
	     else{
	    	 break;
	     }
		
	}
	if(i==0){
		System.out.println("DIVISION DONE");
	}
	else{
		System.out.println("MAX_INT");
	
	}
	in.close();
}
}
