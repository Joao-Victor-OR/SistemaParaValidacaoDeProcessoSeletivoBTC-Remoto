public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
        analisarCandidato(1600);
        analisarCandidato(2400);
        analisarCandidato(2000);

    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando Resultado de demais candidatos");
        }
    }
}
