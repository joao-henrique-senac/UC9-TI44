package execicios;

import java.util.Scanner;
//ADICIONAR a conversão de polegadas para fé 
//Formula: pes = polegada / 12.0 
public class atividade2 {
    public static void main(String[] args) {
        
    
    //declarações de variaveis 
    final double CM_PARA_POL = 2.54;
    final double POL_PARA_PES = 12.0;
    double cm;
    double polegadas;
    double pes;
    int pol;
    Scanner in = new Scanner(System.in);
    //Fim da declaração 
    //Entrada de dados do usuario 
    System.out.println("Digite um valor exato:");
    cm = in.nextDouble();
    //Operção dos dados
    polegadas = (cm / CM_PARA_POL);
    pes = (polegadas / POL_PARA_PES );
    //casting:
        pol = (int)polegadas;// casting não é necessário pois int está "contido" no tipo duble """(MAIS COMPLEXO)""

    //Saida de dados 
    System.out.printf("%.2f cm = %.2f pol = %.2f pés\n",pes,cm,polegadas);
    System.out.printf("%d esse é o valor da variavel pol\n",pol );
   
    }


}