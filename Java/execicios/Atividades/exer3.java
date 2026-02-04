package execicios.Atividades;

import java.util.Scanner;

public class exer3 {
   
   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int nota;
         System.out.println("Digite a nota do aluno:");
         nota = in.nextInt();
         if (nota >= 6) {
              System.out.println("Aluno aprovado.");
         } else {
              System.out.println("Aluno reprovado.");
         }
    } 
}
