package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       System.out.println("Processo seletivo");

        String[] candidatos = {"Augusto","Marcia","Marcos","Monica","Fabricio"};
        for(String candidato : candidatos){
            entradoEmContato(candidato);

        }

    }
    static void entradoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atendeu();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato Realizado com sucesso");
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas );
        } else {
            System.out.print("Não conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizadas.");
        }

    }
    //metodo auxiliar

    private static boolean atendeu() {
        return new Random().nextInt(3)==1;
    };


    static void imprimirSelecionados(){
        String[] candidatos = {"Augusto","Marcia","Marcos","Monica","Fabricio"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
        }
        System.out.println("======================================");
        System.out.println("Forma abreviada de interação for each");
        System.out.println("======================================");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }


    };

    static void selecaoCandidatos(){

        String[] candidatos = {"Augusto","Marcia","Marcos","Monica","Fabricio","Mirela","Daniel","Josias","Mauro", "Oseias"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        };

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
