package guviworkspace;

import java.util.Scanner;

public class Hunter32 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	//int[] array=new int[size];
	/*for(int i=0;i<size;i++){
		array[i]=in.nextInt();
	}*/
	if(size>1){
	int count=0;
	while(size>=1){
		size=size/2;
		count++;
	}
	int d=(int)Math.pow(2,count-1);
	System.out.println(d);
	}
	else{
		System.out.println("invalid input");
	}
	in.close();
}
}
