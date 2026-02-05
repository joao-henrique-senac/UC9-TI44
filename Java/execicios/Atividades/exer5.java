package execicios.Atividades;

public class exer5 {
    public static void main(String[] args) {
        //Exemplo de desenvolvimento incremental:
        //calacular a distância entre dois pontos
        //distância dada por: dist = {(x2 - x1)² + (y2 - y1)²}^(1/2)
        //Atividade 1: realizar o calculo dentro de um metodo.
        //static void calcularDistancia(double x1, double y1, double x2, double y2){}
      
        calcularDistancia(2, 3, 5, 7);
        
    }
       public static void calcularDistancia(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distX = dx * dx;
        double distY = dy * dy;
        double resultado = Math.sqrt(distX + distY);
        System.out.println("Distância entre os pontos: " + resultado);
       }
    
}
