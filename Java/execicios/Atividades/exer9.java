package execicios.Atividades;

public class exer9 {
//    ## Exercício 9 - Reajuste Salarial
//Desenvolva um algoritmo que receba o salário de um funcionário, calcule e mostre seu
//novo salário com reajuste de 15%.() ----multiplicar por 0.15

    public static void main(String[] args) {
        double salario = 2000.0; // Salário do funcionário
        double reajuste = 0.15; // Reajuste de 15%

        double novoSalario = salario + (salario * reajuste); // Cálculo do novo salário

        System.out.println("O novo salário do funcionário é: R$ " + novoSalario);
    }
}
