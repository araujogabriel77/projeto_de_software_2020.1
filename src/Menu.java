import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        
        System.out.println();
        System.out.println("-- Sistema de folha de pagamento --");
        System.out.println();
        System.out.println("[1]: Adicionar um empregado");
        System.out.println("[2]: Remover um empregado");
        System.out.println("[3]: Lançar um cartão de ponto");
        System.out.println("[4]: Lançar um resultado de venda");
        System.out.println("[5]: Lançar uma taxa de serviço");
        System.out.println("[6]: Alterar detalhes de um empregado");
        System.out.println("[7]: Rodar a folha de pagamento para HOJE");
        System.out.println("[8]: Desfazer ultima transação feita");
        System.out.println("[9]: Refazer ultima transação desfeita");
        System.out.println("[10]: Agendar um pagamento");
        System.out.println("[11]: Criar nova agenda de pagamentos");
        System.out.println();
        
        System.out.println("Você escolheu a opção: ", option);
        
        System.out.println(); 
    }
    
}
