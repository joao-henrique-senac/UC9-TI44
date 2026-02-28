package execicios.Atividades;

public class vetores {
    public static void printaArray(int[] a){
        //escrever o metodo que passando um array int unidimensional 
        // o metodo impreme os vslores de cada posicao do array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static void main(String[] args) {
        int [] couts = {1, 2, 3, 4, 5};
        double [] values;
        int size = 10; 


        couts = new int[4];
        values = new double[size];


        int[] a = {1, 2, 3, 4, 5};
        couts[0] = 7;
        couts[1] = couts[0] * 2;
        couts[2] ++;
        couts[3] -= 60;
        printaArray(couts);
        .
    }
}
