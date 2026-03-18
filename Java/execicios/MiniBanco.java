package execicios;
import java.util.Scanner;
public class MiniBanco {

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;
    
    static double calcularTotalSaque(double valor){
        return valor + (valor * TAXA_SAQUE);

    }

    static boolean dentroDoLimite(double valor){
        return valor <= LIMITE_SAQUE;
    }

    static boolean saldoSuficiente(double saldo, double valor){
        return saldo >= calcularTotalSaque(valor);

    } 

    static double  sacar(double saldo, double valor){
        return saldo - calcularTotalSaque(valor);
    }

    static void exibirMenu(){
        System.out.println("\n== MiniBanco ==");
        System.out.println("1 - Depositar ");
        System.out.println("2 - sacar ");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - ver Extrato ");
        System.out.println("0 - Sair ");
        System.out.print("Escolha: ");
    }

    static double depositar(double saldo, double valor){
        return saldo + valor;
    }

    static void exibirSaldo(double saldo){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    static boolean valorValido(double valor){
        return valor > 0;
    }


    static void exibirExtrado(String[]extrato, int totallinhas){
        System.out.println("\n --Extrato------------");
        if (totallinhas == 0){
            System.out.println("Nenhuma movimentação.");
        }else {
            for (int i = 0; i < totallinhas; i++){
                System.out.println(" "+ extrato[i]);
            }
        }

        System.out.println("----------------------");

    } 

    static int registrar(String[]extrato, int totallinhas, String linha){
        extrato[totallinhas] = linha;
        return totallinhas + 1;
    }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //variaveis do extrato 
    String[] extrato = new String[50];
    int totallinhas = 0;
    //variaveis principais da conta 
    double saldo    = 0.0;
    int    opcao    = -1; 

    //Boas vindas 
    System.out.print("Digite o seu nome: ");
    String nome = scanner.next();
    System.out.printf("Olá %s! Saldo inicial: R$ %.2f\n", nome, saldo);

    while (opcao != 0) {
        exibirMenu();

        opcao = scanner.nextInt();
        if (opcao == 1 ){
            //System.out.println(" [Depositar - breve] ");
            System.out.print("Valor a depositar: R$ ");
            double valor = scanner.nextDouble();
            
            if (!valorValido(valor)){
                System.out.println("Atenção, valor inválido. Valor deve ser maior que zero.");
            }else {
                saldo = depositar(saldo, valor);
                System.out.println("Deposito realizado!");
                exibirSaldo(saldo);
                totallinhas = registrar(extrato, totallinhas, String.format("DEPÓSITO 🟩 + %.2f => Saldo R$ %.2f,",valor, saldo ));
      
                
            }


            
        }else if (opcao == 2) {
          //  System.out.println("[Sacar - em breve]");

           System.out.printf("Valor Sacar: R$ ");
           double valorSaque = scanner.nextDouble();

           if (!valorValido(valorSaque)) {
                System.out.println("Atenção, valor inválido.");
           }else if (!dentroDoLimite(valorSaque)){
            System.out.printf("limite exedido. Maximo: R$ %.2f%n", LIMITE_SAQUE);
           }else if (!saldoSuficiente(saldo, valorSaque)){
            System.out.printf("Saldo insuficiente. Necessario: R$ %.2fn" ,calcularTotalSaque(valorSaque));

           }else{
            double taxa = valorSaque * TAXA_SAQUE;
            saldo = sacar(saldo, valorSaque);
            System.out.printf("Saque realizado. Taxa cobrada: R$ %.2f%n", taxa);
            totallinhas = registrar(extrato, totallinhas, String.format("SAQUE ⭕ -R$ %.2f => Saldo R$ %.2f", valorSaque, saldo  ));
           }
          
         
        }else if (opcao == 3){
           // System.out.println("[Consultar Saldo]");
            exibirSaldo(saldo);
        }else if (opcao == 4 ){
            //System.out.println("[Extrato - em breve]");
            exibirExtrado(extrato, totallinhas);
        }else if (opcao == 0 ){
            exibirExtrado(extrato, totallinhas);
            System.out.println("Até logo "+ nome +"!");
        }else {
            System.out.println("Opção Inválida. ");
        }

        
    }

    
    scanner.close();
  }   
}
