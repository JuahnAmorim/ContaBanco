package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Digite sua agência: ");
        agencia = sc.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();
        
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta"
                          + " em nosso banco, sua agência é " + agencia + ", conta "
                          + numero + " e seu saldo " + saldo + " já está disponível"
                          + " para saque.");
        
        sc.close();
    }
    
}
