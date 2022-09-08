import java.util.Scanner;
public class SuperCalculadorA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Inicializando calculadora...");
            System.out.println("Qual operação você deseja realizar? \n1- Adição \n2- Subtração" +
                    " \n3- Mutiplicação \n4- Divisão \n5- Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1: Adicao operacao = new Adicao();
                operacao.realizarAdicao();
                    break;
                case 2: Subtracao operacao2 = new Subtracao();
                operacao2.realizarSubtracao();
                    break;
                case 3: Mutiplicacao operacao3 = new Mutiplicacao();
                operacao3.realizarmutiplicacao();
                    break;
                case 4: Divisao operacao4 = new Divisao();
                operacao4.realizarDivisao();
                    break;
                case 5:
                    System.out.println("Saindo do sistema!");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        }while (opcao != 5);
    }
}
