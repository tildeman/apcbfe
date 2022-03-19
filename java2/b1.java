package java2;

import java.io.IOException;
import java.util.Scanner;

public class b1 {
	public static void main(String[] args) throws IOException{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int s1=0,s3=0;
		for (int i=0;i<n;i++){
			s1+=i;
			if (i%3==0) s3+=i;
		}
		System.out.println((n%2==0)+"\n"+s1+"\n"+s3);
		input.close();
	}
}
