package java2;

import java.io.IOException;
import java.util.Scanner;

class ifelse{
	public static void main(String[] args) throws IOException{
		Scanner input= new Scanner(System.in);
		int choice=input.nextInt();
		switch(choice){
			case 1:
				System.out.println("Add:");
				break;
			case 2:
				System.out.println("Sub:");
				break;
			case 3:
				System.out.println("Mul:");
				break;
			case 4:
				System.out.println("Div:");
				break;
			default:
				System.out.println("Invalid choice");
		}
		input.close();
	}
}