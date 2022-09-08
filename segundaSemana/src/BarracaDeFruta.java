import java.util.ArrayList;
import java.util.Scanner;
public class BarracaDeFruta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruta = new ArrayList<String>();

        fruta.add("maçã");
        fruta.add("banana");
        fruta.add("abacaxi");
        fruta.add("manga");
        fruta.add("tangerina");

        int opcao;
        do{
            System.out.println("Seja bem-vindo a Barraca de fruta! \nTudo bem? \nNo que posso ajudar?");
            System.out.println("1- Cadastrar Fruta; \n2- Lista Frutas; \n3- Excluir Fruta;" +
                    " \n4- Listar Fruta; \n5- Alterar Fruta; \n6- Sair; ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1: cadastrarFruta(fruta);
                    break;
                case 2: listaDeFrutas(fruta);
                    break;
                case 3: excluirFruta(fruta);
                    break;
                case 4: listarFruta(fruta);
                    break;
                case 5: alterarFruta(fruta);
                    break;
                case 6:
                    System.out.println("Saindo do sistema!");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 6);

    }
    public static void cadastrarFruta(ArrayList<String> modelo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas frutas você deseja cadastrar?");
        int quant = sc.nextInt();
        for(int i = 0; i < quant; i++) {
            System.out.println("Digite a fruta que você desja cadastrar:");
            String resultado = sc.nextLine();
            modelo.add(resultado);
            System.out.println("Fruta cadastrada com sucesso!");
        }
    }

    public static void listaDeFrutas(ArrayList<String> modelo){
        System.out.println("Segue a baixo de lista de frutas cadastradas:");
        for(int i = 0; i <modelo.size(); i++){
            System.out.println("Fruta "+(i+1)+":"+modelo.get(i));
        }
    }

    public static void excluirFruta(ArrayList<String> modelo){
        boolean excluido = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual fruta você deseja excluir?");
        String resultado = sc.nextLine();
        for (int j = 0; j < modelo.size(); j++) {
            if (resultado.equals(modelo.get(j))) {
                modelo.remove(resultado);
                System.out.println("Fruta removida com sucesso!");
                excluido = true;
            }
        }if(!excluido){
            System.out.println("Nome da fruta não foi encontrado!");
        }
    }

    public static void listarFruta(ArrayList<String> modelo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id da fruta que voce deseja procurar:");
        int resultado = sc.nextInt();
        if(resultado < modelo.size()){
            System.out.println("A fruta do id "+resultado+" é "+modelo.get(resultado));
        } else{
            System.out.println("Id inválido!");
            listarFruta(modelo);
        }

    }

    public static void alterarFruta(ArrayList<String> modelo){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o id da fruta que voce deseja alterar:");
        int resultado = sc.nextInt();
        System.out.println("Digite o novo nome da fruta que voce deseja alterar:");
        String resultado2 = sc2.nextLine();
        modelo.set(resultado, resultado2);
        System.out.println("Fruta alterado com sucesso! \nA seguir nova lista de frutas:");
        listaDeFrutas(modelo);

    }
}
