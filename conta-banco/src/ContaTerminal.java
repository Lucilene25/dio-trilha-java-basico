

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // permitir ponto decimal, ex: 237.48

        try {
            // 1) AGÊNCIA (String)
            System.out.print("Por favor, digite o número da Agência ! ");
            String agencia = scanner.nextLine();

            // 2) NÚMERO DA CONTA (int)
            System.out.print("Por favor, digite o número da Conta ! ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // consome o ENTER deixado na leitura do número

            // 3) NOME DO CLIENTE (linha completa)
            System.out.print("Por favor, digite o Nome do Cliente ! ");
            String nomeCliente = scanner.nextLine();

            // 4) SALDO (decimal)
            System.out.print("Por favor, digite o Saldo (ex: 237.48) ! ");
            double saldo = scanner.nextDouble();
            // scanner.nextLine(); // não necessário se não há mais leitura de texto

            // Construir a mensagem de saída
            // Usando concat() para demonstrar:
            String msgConcat = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.format(Locale.US, "%.2f", saldo))
                .concat(" já está disponível para saque.");

            
            // Exibir uma das mensagens geradas (mesma saída):
            System.out.println();
            System.out.println(msgConcat);

        } catch (java.util.InputMismatchException ex) {
            System.err.println("Entrada inválida: certifique-se de digitar um número inteiro (para conta) e um decimal com ponto (para saldo).");
        } finally {
            scanner.close(); // liberar recursos
        }
    }
}

        //TODO:conhecer e importar a classe scanner
       
       // Exibir as mensagens para o nosso usuário

       // obter pelo scaner os valores digitados no terminal

       // Exibir a mensagem da conta criada
    

