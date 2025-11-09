// Precisamos importar o Scanner
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); 
		// Quando fazemos isso da um quebra de linha no buffer, e ai fico salvo a quebra de linha do x para o s1
		// Para arrumar isso: Faço outro nextline antes do primeiro nextline
		
		sc.nextLine();
		// .nextLine() ------> Lê até a quebra de linha
		s1 = sc.nextLine(); // Assim vc lê a linah toda, só o next(), le apenas a palavra
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados!");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}

