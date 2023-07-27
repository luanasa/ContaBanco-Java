import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua Conta! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência! ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome Completo! ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo que deseja sacar! ");
        Double saldo = scanner.nextDouble();

        System.out.println();

        System.out.println("Olá, " + nome + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
