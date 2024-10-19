package Candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidado(1900.0);
        analisarCandidado(2200.0);
        analisarCandidado(2000.0);
    }
    static void analisarCandidado(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase==salarioPretendido)
            System.out.println ("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println ("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
