import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        class OptionsMenu {
            public String[] op = { "Adicionar um empregado", "Remover um empregado", "Lançar um cartão de ponto",
                    "Lançar um resultado de venda", "Lançar uma taxa de serviço", "Alterar detalhes de um empregado",
                    "Rodar a folha de pagamento para HOJE", "Desfazer ultima transação feita",
                    "Refazer ultima transação desfeita", "Agendar um pagamento", "Criar nova agenda de pagamentos" };
        }
        ;

        OptionsMenu options = new OptionsMenu();

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println();
        System.out.println("-- Sistema de folha de pagamento --");
        System.out.println();
        System.out.printf("[1]: %s\n", options.op[0]);
        System.out.printf("[2]: %s\n", options.op[1]);
        System.out.printf("[3]: %s\n", options.op[2]);
        System.out.printf("[4]: %s\n", options.op[3]);
        System.out.printf("[5]: %s\n", options.op[4]);
        System.out.printf("[6]: %s\n", options.op[5]);
        System.out.printf("[7]: %s\n", options.op[6]);
        System.out.printf("[8]: %s\n", options.op[7]);
        System.out.printf("[9]: %s\n", options.op[8]);
        System.out.printf("[10]: %s\n", options.op[9]);
        System.out.printf("[11]: %s\n\n", options.op[10]);

        System.out.println("Escolha uma opção");
        option = input.nextInt();
        System.out.println();

        System.out.printf("Você escolheu a opção: %d%n", option);

        if (option > 11 || option < 1) {
            System.out.printf("A opção que você escolheu não existe.");
        } else {
            System.out.printf("%s.", options.op[option - 1]);
        }

        System.out.println();

    }

}
