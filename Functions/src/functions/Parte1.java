package functions;
import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your First Name: ");
		String firstName = s.nextLine();
		
		System.out.println("Enter Your Last Name: ");
		String lastName = s.nextLine();
		s.close();
		
		String name = firstName+" "+lastName;
		printNameLength(name);
		printNameCharacters(name);
		
	}
	
	private static void printNameLength( String name ){
		System.out.println("The characters in your name: "+(name.length()-1));
    }

    private static void printNameCharacters(String name){
		for(int i=0; i< name.length() ;i++) {
			System.out.print(name.charAt(i)+" ");
		}
    }

}
