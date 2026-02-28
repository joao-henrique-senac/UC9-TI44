package execicios.Atividades;

public class exer6 {
    //Exercício 6 - Calculando Salário
//Faça um algoritmo que leia o valor que um funcionário ganha por hora e o número de
//horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.(leia numero de hrs trabalhadas, 
//vs salario)

    public static void main(String[] args) {
        double valorHora = 15.0; // Valor que o funcionário ganha por hora
        int horasTrabalhadas = 160; // Número de horas trabalhadas no mês

        double salarioTotal = valorHora * horasTrabalhadas; // Cálculo do salário total

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }
}
