package execicios;

public class metodo {

    public static void newLine() {
        System.out.println("entra no metodo newline" );
    }

    public static void tresLinhas() {
        newLine();
        newLine();
        newLine();
        
    }
    public static void main(String[] args) {
        System.out.println("primeira linha");
        tresLinhas();
        System.out.println("Segunda linha");
        
    }
}
