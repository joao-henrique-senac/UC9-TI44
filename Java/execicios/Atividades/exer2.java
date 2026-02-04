package execicios.Atividades;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = in.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

    }
}
