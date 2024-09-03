import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) . useLocale(Locale.US);
        
        System.out.println("Qual o numero da conta?");
        int numero = scanner.nextInt();

        System.out.println("Qual a Agencia do banco?");
        String agencia = scanner.next();

        System.out.println("Qual o nome do Cliente?");
        String nome = scanner.next();

        System.out.println("Saldo da conta ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta "+ numero + " e seu saldo " + saldo + " já esta disponível para saque.");
        
    }
}
