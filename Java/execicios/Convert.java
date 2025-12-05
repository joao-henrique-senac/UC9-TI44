package execicios;
import java.util.Scanner;
public class Convert {
  

    // Função que converte
    public static double cmParaPolegada(double cm) {
        return cm / 2.54;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor em cm para conversão: ");
        double cm = in.nextDouble();

        double polegada = cmParaPolegada(cm);

        System.out.println("Resultado: " + polegada + " polegadas");
    }
}


