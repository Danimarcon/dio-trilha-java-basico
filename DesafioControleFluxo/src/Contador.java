import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // Lê o primeiro número
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // Lê o segundo número
        
        try {
            // Chama o método que faz a contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de erro se a exceção for lançada
            System.out.println(e.getMessage());
        }
        
        terminal.close();  // Fechando o scanner após o uso
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;
        
        // Realiza a contagem e imprime os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
