import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor (int): ");
		int num = entrada.nextInt();
		System.out.println("num: " + num);
		
		System.out.print("Informe um valor (float): ");
		float numF = entrada.nextFloat();
		System.out.println("numF: " + numF);
		
		System.out.print("Informe um valor (double): ");
		double numD = entrada.nextDouble();
		System.out.println("numD: " + numD);
		
		entrada.nextLine();
		
		System.out.print("Informe um texto (String): ");
		String texto = entrada.nextLine();
		System.out.println("texto: " + texto);
		
		System.out.print("Informe uma letra (char): ");
		char letra = entrada.nextLine().charAt(0);
		// next
		System.out.println("letra: " + letra);
		
		entrada.close();
	}

}