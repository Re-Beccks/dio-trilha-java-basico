import java.util.Locale;
import java.util.Scanner;




public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        float saldo = 237.48f;

       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "conta " + numeroConta + "e seu saldo " + saldo + "já está disponível para saque."); 

        
    }
}
