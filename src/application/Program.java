package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text to be checked: ");
		String text = sc.nextLine();
		
        CheckLetter check = new Verifier(text);
        check.check();
		
        
        sc.close();
    }
}
	
	

