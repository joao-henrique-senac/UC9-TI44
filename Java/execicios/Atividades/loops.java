package execicios.Atividades;

public class loops {
    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("off!");
    }
     public static void main(String[] args) {
        countdown(5);
    }
}