import java.util.Scanner;

public class SortedArrayProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner people = new Scanner(System.in);
		int count = 0;
		String [] names = new String [count];
		
		do {
			System.out.println(" How many people were in the book club");
		while(!people.hasNextInt()) {
			System.out.println("Please try again");
			people.next();
		}
		count = people.nextInt();
		}
		while(count < 0); {
			System.out.println("There are " + count + " people in the book club, now what are their names ");
		}
		
		System.out.println("what are there names");
		
		for(int i = 0; i < names.length; i++) {
			names[i] = people.nextLine();
			
		}
		
		for (String l: names) {
			System.out.println(l);
		}

		
	}

}
