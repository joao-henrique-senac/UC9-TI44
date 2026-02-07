package execicios.Atividades;

import java.util.Scanner;

//   Gerenciador de Maratona de Filmes 
//(avaliação observável) 
//Objetivo 
//Criar um programa em Java que simule um sistema simples para 
//gerenciar uma maratona de filmes. 
//Descrição do Exercício 
//Os alunos devem desenvolver um programa que ajude um usuário a 
//planejar uma maratona de filmes. O programa deve realizar as 
//seguintes tarefas: 
//Parte 1: Estrutura Básica e Saída 
//Criar uma classe `MaratonaFilmes` com método `main` que: 
//1. Exiba um cabeçalho formatado com o nome do sistema usando 
//`printf` 
//2. Use pelo menos 3 `println` e 2 sequências de escape 
//diferentes (`\n`, `\t`) 
//Parte 2: Variáveis e Operadores 
//Declarar e utilizar variáveis para: 
//1. Armazenar: nome do usuário (String), quantidade de filmes 
//(int), horas totais (double) 
//2. Calcular: tempo total baseado em quantidade de filmes × 
//duração média (use operadores aritméticos) 
//3. Converter tipos quando necessário (ex: int para double) 
//Parte 3: Métodos 
//Criar pelo menos 3 métodos além do `main`: 
//1. `exibirCabecalho()` - sem parâmetros, sem retorno (`void`) 
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
// ========================================//
public class MaratonaFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite o nome do primeiro filme: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Digite a duração do primeiro filme em minutos: ");
        int duracaoFilme = scanner.nextInt();
        int duracaoFilme1 = duracaoFilme; // Variável para acumular a duração total dos filmes
        System.out.println("deseja adicionar mais filmes? (s/n)");
        String resposta = scanner.next();
        while (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do próximo filme: ");
            scanner.nextLine(); // Consumir a nova linha
            nomeFilme = scanner.nextLine(); // Ler o nome do filme
            nomeFilme += ", " + nomeFilme; // Acumular os nomes dos filmes
            System.out.print("Digite a duração do filme em minutos: ");
            duracaoFilme = scanner.nextInt();

            duracaoFilme1 += duracaoFilme; // Acumular a duração total

            System.out.println("Deseja adicionar mais filmes? (s/n)");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        calcularDuracaoTotal(nomeFilme, duracaoFilme1);
        
        exibircabesalho(nomeUsuario, nomeFilme, duracaoFilme1);
    
        

        scanner.close();
       String classificacao = clasificarMaratona(duracaoFilme1 / 60.0); // Convertendo minutos para horas
       System.out.println("Classificação da maratona: " + classificacao);
    }

    public static double calcularDuracaoTotal(String nomeFilme1, int duracaoFilme1) {
        return duracaoFilme1 / 60.0; // Convertendo minutos para horas
    }

    public static void exibircabesalho(String nomeUsuario, String nomeFilme, int duracaoFilme1) {
        System.out.println("Gerenciador de Maratona de Filmes");
        System.out.println("Informaçoes da maratona:");
        System.out.println("usuário:"+ nomeUsuario);
        System.out.println("fimes adicionados:" + nomeFilme);
        System.out.println("duraçao total:" + duracaoFilme1 + " minutos");
        System.out.println("-----------------------------");
        System.out.println("Calculoando a duração total da maratona...");
        System.out.println("tempo total em horas:" + duracaoFilme1);
        System.out.println("Classificando a maratona:"+ clasificarMaratona(duracaoFilme1 / 60.0));
    }

    public static String clasificarMaratona(double horas) //recebe horas e retorna uma string com a classificação da maratona
    {
        if (horas < 4) {
            return "Maratona Curta";
        } else if (horas >= 4 && horas < 8) {
            return "Maratona Média";
        } else {
            return "Maratona Longa";
        }
    }
}
