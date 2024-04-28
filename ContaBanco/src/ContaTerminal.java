import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Digite o nome do nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("");
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e sua conta é " + conta + " e seu saldo é de " + saldo + " reais e já está disponível para saque.");
        System.out.println("");
        
        scanner.close();
    }
}
