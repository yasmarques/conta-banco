import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de "+ saldo + " já está disponível para saque!");
            
    }
}

    

