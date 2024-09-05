import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
     //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String numAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt();
        
        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome + ", " + "obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é: " + numAgencia + ", conta: " + numConta + " e seu saldo: " + saldo + " já está disponível para saque.");
        
    }
}
