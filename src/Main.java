import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main( String[] args )
	{
		Scanner s = new Scanner(System.in);
		System.out.println("How many clients will you be working with today?");
		int bounds = s.nextInt();
		LocalDate now = LocalDate.now();
		int[] ages = new int[bounds];
		int counter = 0;
		for(int i =0; i<bounds;i++){
			counter++;
			System.out.println("Please input the birth day");
			int day = s.nextInt();
			System.out.println("Please input the birth month (as an integer)");
			int mon = s.nextInt();
			System.out.println("Please input the birth year");
			int year = s.nextInt();
			int age = now.getYear() - year;
			if(now.getMonthValue() < mon){
				age -=1;
			}
			else if(now.getMonthValue() == mon){
				if(now.getDayOfMonth() < day){
					age -= 1;
				}
			}
			ages[i] = age;
			System.out.println("Would you like to enter details for another client?");
			if(s.next().equals("N")){
				System.out.println("Thanks for using the age calculator!");
				break;
			}
		}
		System.out.println("Ages: ");	
		for(int i = 0; i < counter;i++){
			int j = i + 1;
			System.out.println("Client " + j + ": " + ages[i]);
		}
	}
}
