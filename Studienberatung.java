import java.util.*;
public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String answer = scanner.next();
		if (answer.equalsIgnoreCase("j"){
			System.out.println("Bist du wissbegierig?");
		}
	}
}