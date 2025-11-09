import java.util.Scanner; // import scanner

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // Coleta dados do teclado
      String x = sc.next(); // Passa os dados coletados da var sc para a var string X
      System.out.printf("Você digitou: %s%n", x);
      
      // Exemplo de leitura de numero inteiro
      
      int y;
      y = sc.nextInt();
      System.out.printf("Você digitou: %s%n", y);
      
      // Exemplo de leitura de numero double
      double z;
      z = sc.nextDouble();
      System.out.printf("Você digitou: %s%n", z);
      
      
      // Exemplo Char
      char u;
      u = sc.next().charAt(0); // .charAt 0, pega o primeiro caracter do seu string
      
      sc.close(); // Uma função usada para parar a leitura do teclado quando não usarmos mais
   }
}
