package java2;

import java.io.IOException;
import java.util.Scanner;

public class b2 {
	public static void main(String[] args) throws IOException{
		Scanner input=new Scanner(System.in);
		System.out.print("Mời bạn nhập vào số thứ nhất: ");
		int n1=input.nextInt();
		System.out.print("Mời bạn nhập vào số thứ hai: ");
		int n2=input.nextInt();
		System.out.println("Kết quả của bạn như sau");
		System.out.println("Kết quả phép cộng: "+(n1+n2));
		System.out.println("Kết quả phép trừ: "+(n1-n2));
		System.out.println("Kết quả phép nhân: "+(n1*n2));
		System.out.println("Kết quả phép chia: "+(n1/n2));
		input.close();
	}
}
