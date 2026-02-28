package execicios.Atividades;

public class exer7 {
    
//## Exercício 7 - Indice de Massa Corporal IMC
//Com base na altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
//usando a seguinte fórmula: (72.7 × altura) − 58.(nao fazer)

    public static void main(String[] args) {
        double altura = 1.75; // Altura da pessoa em metros

        double pesoIdeal = (72.7 * altura) - 58; // Cálculo do peso ideal

        System.out.println("O peso ideal para uma pessoa com " + altura + "m de altura é: " + pesoIdeal + " kg");
    }
    
}
