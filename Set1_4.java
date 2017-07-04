package beginner;

import java.util.Scanner;

public class Set1_4 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	char a=in.next().charAt(0);
	if(a>47&&a<58){
		System.out.println("Digit");
	}
	else if((a>64&&a<91)||(a>96&&a<123)){
		System.out.println("Alphabet");
	}
	else{
		System.out.println("Invalid");
	}
	in.close();
}
}
