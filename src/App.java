import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaTeclado = new Scanner(System.in);
        int parcela1, parcela2, soma;

        System.out.print("Digite a 1a parcela - ");
        parcela1 = entradaTeclado.nextInt();

        System.out.print("Digite a 2a parcela - ");
        parcela2 = entradaTeclado.nextInt();

        soma = parcela1 + parcela2 ;

        System.out.print("O resultado das parcelas é: " + soma);


    }
}
