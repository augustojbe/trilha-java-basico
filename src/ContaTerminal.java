import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.printf("Por favor, digite o número da Agência:\n");
        agencia = ler.nextLine();
        System.out.printf("Qual o numero do seu Usuário:\n");
        numero = ler.nextInt();

        System.out.printf("Óla " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já ésta disponivel para saque .");
    }


}
