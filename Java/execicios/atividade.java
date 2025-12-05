package execicios;
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        String nome, sobrenome;
        System.out.println("Digite o seu primeiro nome");
        Scanner in = new Scanner(System.in);
        nome = in.nextLine();
        System.out.println("Digite o seou sobre nome");
        sobrenome = in.nextLine();

        System.out.println(nome + " " + sobrenome );
    }
    
}
