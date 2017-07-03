package guviworkspace;

import java.util.Scanner;

public class arrayaverage {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++){
		array[i]=in.nextInt();
	}
	int d=n/2;
	int c=n-d;
	int sum1=0;
	int sum2=0;
	int[] arr1=new int[c];
	int[] arr2=new int[d];
	for(int i=0;i<c;i++){
		arr1[i]=array[i];
		sum1+=arr1[i];
	}
	for(int i=0;i<d;i++){
		arr2[i]=array[c+i];
		sum2+=arr2[i];
	}
	float avg1=sum1/c;
	float avg2=sum2/d;
	if(avg1==avg2){
		System.out.println("1st array");
		for(int i=0;i<c;i++){
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println("\n");
		System.out.println("2nd array");
		for(int i=0;i<d;i++){
			System.out.print(arr2[i]+" ");
			
		}
	}
	else{
		System.out.println("NOT POSSIBLE");
	}
}
}
