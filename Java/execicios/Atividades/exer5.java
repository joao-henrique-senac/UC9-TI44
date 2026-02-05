package execicios.Atividades;

public class exer5 {
    public static void main(String[] args) {
        //Exemplo de desenvolvimento incremental:
        //calacular a distância entre dois pontos
        //distância dada por: dist = {(x2 - x1)² + (y2 - y1)²}^(1/2)
        //Atividade 1: realizar o calculo dentro de um metodo.
        //static void calcularDistancia(double x1, double y1, double x2, double y2){}
        
       double x1,x2,y1,y2,distX,distY,dx,dy,resultado;
       x1 = 0;
       y1 = 0;
       x2 = 3;
       y2 = 4;
       dx = x2 - x1;
       dy = y2 - y1;
       distX = dx * dx;
       distY = dy * dy;
       System.out.println("Distancia em X ao quadrado: " + distX);
       System.out.println("Distancia em Y ao quadrado: " + distY);
       resultado = Math.sqrt(distX + distY);
       System.out.println("Distância entre os pontos: " + resultado);
         calcularDistancia(0,0,3,4);
         
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
