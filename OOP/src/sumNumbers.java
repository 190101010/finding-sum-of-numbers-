// Kübra YAYLA
// summing numbers increasing one by one
// 17.07.2022 Sunday




import java.util.Scanner;

public class sumNumbers {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the last number");
		
		int number = s.nextInt();
		
		int result = number * (number+1) / 2;
		
		System.out.println("\n"+result);
		
	}

}
