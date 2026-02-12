package execicios.Atividades;

import java.util.Scanner;

public class exerh {
//     Gerenciador de Maratona de Filmes 
// (avaliação observável) 
// Objetivo 
// Criar um programa em Java que simule um sistema simples para 
// gerenciar uma maratona de filmes. 
// Descrição do Exercício 
// Os alunos devem desenvolver um programa que ajude um usuário a 
// planejar uma maratona de filmes. O programa deve realizar as 
// seguintes tarefas: 
// Parte 1: Estrutura Básica e Saída 
// Criar uma classe `MaratonaFilmes` com método `main` que: 
// 1. Exiba um cabeçalho formatado com o nome do sistema usando 
// `printf` 
// 2. Use pelo menos 3 `println` e 2 sequências de escape 
// diferentes (`\n`, `\t`) 
// Parte 2: Variáveis e Operadores 
// Declarar e utilizar variáveis para: 
// 1. Armazenar: nome do usuário (String), quantidade de filmes 
// (int), horas totais (double) 
// 2. Calcular: tempo total baseado em quantidade de filmes × 
// duração média (use operadores aritméticos) 
// 3. Converter tipos quando necessário (ex: int para double) 
// Parte 3: Métodos 
// Criar pelo menos 3 métodos além do `main`: 
// 1. `exibirCabecalho()` - sem parâmetros, sem retorno (`void`) 
// 2. `calcularTempoTotal(int filmes, double duracaoMedia)` - com 
// parâmetros e retorno `double` 
// 3. `classificarMaratona(double horas)` - recebe horas e retorna 
// uma String com a classificação 
// Parte 4: Condicionais e Lógica 
// Implementar lógica de decisão: 
// 1. No método `classificarMaratona`, usar `if-else if-else` para 
// classificar: - Até 4 horas: "Maratona Leve" - 4 a 8 horas: "Maratona Moderada" - Mais de 8 horas: "Maratona Épica!" 
// 2. Usar operadores de comparação e lógicos 
// 3. Criar um método booleano `isValida(int filmes)` que retorna 
// `true` se a quantidade for positiva 
// Parte 5: Integração Completa 
// No método `main`: 
// 1. Chamar os métodos na ordem correta 
// 2. Exibir um resumo formatado com todas as informações 
// 3. Relatório de testes de outros dois sistemas desenvolvidos por 
// outros programadores. 
// Exemplo de Saída Esperada 
// ======================================== 
// GERENCIADOR DE MARATONA DE FILMES 
// ======================================== 
// Informações da Maratona: 
// Usuário: João 
// Filmes planejados: 3 
// Duração média por filme: 2.5 horas 
// Cálculos: 
// Tempo total: 7.5 horas 
// Classificação: Maratona Moderada 
// Validação: Planejamento válido? true 
// ========================================

    // Parte 1: Método para exibir cabeçalho
    public static void exibirCabecalho() {
        System.out.println("========================================");
        System.out.printf("GERENCIADOR DE MARATONA DE FILMES\n");
        System.out.println("========================================");
    }

    // Parte 2 e 3: Método para calcular tempo total
    public static double calcularTempoTotal(int filmes, double duracaoMedia) {
        return filmes * duracaoMedia;
    }

    // Parte 3: Método para classificar maratona
    public static String classificarMaratona(double horas) {
        if (horas <= 4) {
            return "Maratona Leve";
        } else if (horas <= 8) {
            return "Maratona Moderada";
        } else {
            return "Maratona Épica!";
        }
    }

    // Parte 4: Método para validar quantidade de filmes
    public static boolean isValida(int filmes) {
        return filmes > 0;
    }

    // Parte 5: Método main com integração completa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir cabeçalho
        exibirCabecalho();

        // Entrada de dados do usuário
        System.out.println("\nDigite as informações da maratona:");
        System.out.print("Nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Quantidade de filmes: ");
        int quantidadeFilmes = scanner.nextInt();

        System.out.print("Duração média por filme (em horas): ");
        double duracaoMedia = scanner.nextDouble();

        // Exibir informações da maratona
        System.out.println("\n--- Informações da Maratona ---");
        System.out.println("Usuário: " + nomeUsuario);
        System.out.println("Filmes planejados: " + quantidadeFilmes);
        System.out.println("Duração média por filme: " + duracaoMedia + " horas");

        // Cálculos
        System.out.println("\n--- Cálculos ---");
        double tempoTotal = calcularTempoTotal(quantidadeFilmes, duracaoMedia);
        System.out.println("Tempo total: " + tempoTotal + " horas");

        // Classificação
        String classificacao = classificarMaratona(tempoTotal);
        System.out.println("Classificação: " + classificacao);

        // Validação
        boolean valido = isValida(quantidadeFilmes);
        System.out.println("Validação: Planejamento válido? " + valido);

        System.out.println("========================================");

        scanner.close();
    }
}
