import java.util.Scanner;

public class MaiusculaMinuscula {

	public static void main(String[] args) {
		
		String frase;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a sua frase:");
		frase = input.nextLine();
		
		System.out.printf("%nMai�scula:%n%s%n%n", frase.toUpperCase());
		System.out.printf("Min�scula:%n%s", frase.toLowerCase());
		
	}

}
