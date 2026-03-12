public class AnaliseMeteorologica {
// Isso é o inicio do programa, o que significa que a classe se chama AnaliseMeteorologica, e é a classe principal do programa
// double[Máxima][Mínima]= Matriz de números decimais com 2 dimensões (linhas e colunas)
static double[][] temperaturas = {
            {32.5, 22.1},  // Cidade 1 
            {28.3, 18.7},  // Cidade 2
            {35.8, 24.9},  // Cidade 3
            {30.2, 20.5},  // Cidade 4
            {25.7, 15.3}   // Cidade 5 
    };
//Como já foi dito na linha 3, isso é um introdução de dados para o programa rodar (variaveis)
// int[Manhã][Tarde][Noite]= Matriz de números inteiros com 2 dimensões (linhas e colunas)
    static int[][] umidades = {
            {85, 60, 75}, // cidade 1
            {78, 55, 70}, // cidade 2
            {90, 65, 80}, // cidade 3
            {82, 58, 72}, // cidade 4
            {75, 50, 68}  // cidade 5
    };

    // ==============================
    // MÉTODO MAIN
    // ==============================

    // Esse é o Metodo maim, ele é o metodo principal do programa, onde o programa começa a ser executado

    public static void main(String[] args) {
        gerarRelatorioDetalhado();
    }

    // ==============================
    // MÉTODOS OBRIGATÓRIOS
    // ==============================
    
    // Esse é o metodo para calcular a média ponderada da temperatura, onde a temperatura
    // máxima tem um peso de 70% e a mínima tem um peso de 30%, e retorna a média ponderada,
    // caso as temperaturas estejam fora do intervalo permitido, retorna 0
    
    public static double calcularMediaPonderadaTemperatura(double max, double min) {
        if (max < -50 || max > 60 || min < -50 || min > 60) {
            return 0;
        }
        return (max * 0.7) + (min * 0.3);
    }

    // Esse é o metodo para classificar o clima, onde a classificação é feita com base na média ponderada
    // da temperatura e na média da umidade, e retorna a classificação do clima

    public static String classificarClima(double tempMedia, double umidadeMedia) {

        if (tempMedia > 30 && umidadeMedia > 75) {
            return "MUITO QUENTE";
        } else if (tempMedia >= 20 && tempMedia <= 25 &&
                   umidadeMedia >= 50 && umidadeMedia <= 70) {
            return "CONFORTAVEL";
        } else if (tempMedia < 15 && umidadeMedia < 50) {
            return "FRIO E SECO";
        } else if (tempMedia > 25) {
            return "QUENTE MODERADO";
        } else {
            return "QUENTE LEVE";
        }
    }

    // Esse é o metodo para indetificar com a maior amplitude termica,
    // ou seja a diferença entre a temperatura máxima e mínima, para cada cidade, e retornar
    // o indice da cidade com a maior amplitude
    // Ele vai passar por todas as cidades, Calculando a amplitude termica de cada uma, ele guarda 
    // a maior encontrada e retorna o indice da cidade com maior diferencia de temperatura  


    public static int identificarCidadeComMaiorAmplitudeTermica() {
        double maiorAmplitude = 0;
        int indice = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            double amplitude = temperaturas[i][0] - temperaturas[i][1];
            if (amplitude > maiorAmplitude) {
                maiorAmplitude = amplitude;
                indice = i;
            }
        }
        return indice;
    }
    // Esse metodo calcula o índice de calor ele usa temperatura (temp) e umidade (umidade) 
    // para calcular a sensação termica 
    public static double calcularIndiceCalor(double temp, double umidade) {
        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);
        return Math.round(indice * 10.0) / 10.0;
    }
    // esse metodo vai gerar um alerta para a cidade com o menor nivel de umidade 
    public static int gerarAlertas(int cidade) {

        double tempMax = temperaturas[cidade][0]; // significa temperatura máxima.
        double tempMin = temperaturas[cidade][1]; // significa temperatura mínima.
        double variacao = tempMax - tempMin; // diferença entre máxima e mínima

        double umidadeMedia = calcularMediaUmidade(cidade);

        if (tempMax > 35 || umidadeMedia > 90) {
            return 2; // VERMELHO
        } else if ((tempMax >= 30 && tempMax <= 35 && umidadeMedia > 80)
                || variacao > 15) {
            return 1; // AMARELO
        } else {
            return 0; // VERDE
        }
    }

    public static double[] calcularEstatisticasAvancadas() {

    double soma = 0; //Ela vai guardar a soma de todas as temperaturas.
    double maior = temperaturas[0][0]; // Aqui ele assume que essa é a maior por enquanto.
    double menor = temperaturas[0][1]; // Aqui ele assume que é a menor temperatura por enquanto.
    int total = 0; //Essa variável vai contar quantas temperaturas existem.

    for (int i = 0; i < temperaturas.length; i++) {

        double max = temperaturas[i][0];
        double min = temperaturas[i][1];

        soma = soma + max;
        soma = soma + min; // Ele vai somando todas as temperaturas.

        if (max > maior) {
            maior = max;
        }

        if (min < menor) {
            menor = min;
        }

        if (min > maior) {
            maior = min;
        }

        if (max < menor) {
            menor = max;
        }

        total = total + 2;
    }

    double media = soma / total;

    return new double[]{media, maior, menor};
}
public static double calcularMediaUmidade(int cidade) { 

    double soma = umidades[cidade][0] + umidades[cidade][1] + umidades[cidade][2]; // manhã, tarde, noite
    double media = soma / 3;

    return media;
} 

public static String traduzirAlerta(int codigo) {

    if (codigo == 2) {
        return "VERMELHO";
    }

    if (codigo == 1) {
        return "AMARELO";
    }

    return "VERDE";
}

    // ==============================
    // RELATÓRIO FINAL FORMATADO
    // ==============================

    public static void gerarRelatorioDetalhado() {

        System.out.println("======================================================");
        System.out.println("      SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
        System.out.println("======================================================\n");

        System.out.println("ANÁLISE DETALHADA POR CIDADE:");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-6s| %-6s| %-6s| %-6s| %-6s| %-18s| %-7s\n",
                "CIDADE", "T.MAX", "T.MIN", "T.MÉD", "UMID%", "CLASSIFICAÇÃO", "ALERTA");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < temperaturas.length; i++) {

            double max = temperaturas[i][0];
            double min = temperaturas[i][1];
            double mediaTemp = calcularMediaPonderadaTemperatura(max, min);
            double mediaUmid = calcularMediaUmidade(i);

            String classificacao = classificarClima(mediaTemp, mediaUmid);
            String alerta = traduzirAlerta(gerarAlertas(i));

            System.out.printf("%6d | %5.1f°C| %5.1f°C| %5.1f°C| %6.1f | %-18s| %-7s\n",
                    (i + 1), max, min, mediaTemp, mediaUmid, classificacao, alerta);
        }

        System.out.println("-------------------------------------------------------------------\n");

        double[] stats = calcularEstatisticasAvancadas();

        System.out.println("ESTATÍSTICAS GERAIS:");
        System.out.printf("• Temperatura média geral: %.1f°C\n", stats[0]);
        System.out.printf("• Cidade mais quente: #%d (%.1f°C)\n",
                identificarCidadeMaisQuente(), stats[1]);
        System.out.printf("• Cidade mais fria: #%d (%.1f°C)\n",
                identificarCidadeMaisFria(), stats[2]);
        System.out.printf("• Maior amplitude térmica: #%d (%.1f°C)\n",
                identificarCidadeComMaiorAmplitudeTermica() + 1,
                temperaturas[identificarCidadeComMaiorAmplitudeTermica()][0]
                        - temperaturas[identificarCidadeComMaiorAmplitudeTermica()][1]);
    }

    public static int identificarCidadeMaisQuente() {
        double maior = temperaturas[0][0];
        int indice = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i][0] > maior) {
                maior = temperaturas[i][0];
                indice = i;
            }
        }
        return indice + 1;
    }

    public static int identificarCidadeMaisFria() {
        double menor = temperaturas[0][1];
        int indice = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i][1] < menor) {
                menor = temperaturas[i][1];
                indice = i;
            }
        }
        return indice + 1;
    }
}