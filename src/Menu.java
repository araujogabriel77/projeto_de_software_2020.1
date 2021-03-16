import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        class OptionsMenu {
            public String op_1 = "Adicionar um empregado";
            public String op_2 = "Remover um empregado";
            public String op_3 = "Lançar um cartão de ponto";
            public String op_4 = "Lançar um resultado de venda";
            public String op_5 = "Lançar uma taxa de serviço";
            public String op_6 = "Alterar detalhes de um empregado";
            public String op_7 = "Rodar a folha de pagamento para HOJE";
            public String op_8 = "Desfazer ultima transação feita";
            public String op_9 = "Refazer ultima transação desfeita";
            public String op_10 = "Agendar um pagamento";
            public String op_11 = "Criar nova agenda de pagamentos";
        }
        ;

        OptionsMenu options = new OptionsMenu();

        Scanner input = new Scanner(System.in);
        int option;

        System.out.println();
        System.out.println("-- Sistema de folha de pagamento --");
        System.out.println();
        System.out.printf("[1]: %s\n", options.op_1);
        System.out.printf("[2]: %s\n", options.op_2);
        System.out.printf("[3]: %s\n", options.op_3);
        System.out.printf("[4]: %s\n", options.op_4);
        System.out.printf("[5]: %s\n", options.op_5);
        System.out.printf("[6]: %s\n", options.op_6);
        System.out.printf("[7]: %s\n", options.op_7);
        System.out.printf("[8]: %s\n", options.op_8);
        System.out.printf("[9]: %s\n", options.op_9);
        System.out.printf("[10]: %s\n", options.op_10);
        System.out.printf("[11]: %s\n\n", options.op_11);

        System.out.println("Escolha uma opção");
        option = input.nextInt();
        System.out.println();

        System.out.printf("Você escolheu a opção: %d%n", option);

        if (option > 11 || option < 1) {
            System.out.printf("A opção que você escolheu não existe.");
        }

        System.out.println();
    }

}
