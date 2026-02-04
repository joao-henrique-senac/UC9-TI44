package execicios.Atividades;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        int idade;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = in.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
