import java.util.Scanner;
public class locacaoCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carro[] = new String[20];
        carro[0] = "corsa"; carro[1] = "palio";  carro[2] = "uno";
        carro[3] = "onix";  carro[4] = "corola"; carro[5] = "bmw";
        carro[6] = "cruze"; carro[7] = "spin";   carro[8] = "camaro";
        carro[9] = "f1";    carro[10] = "fox";   carro[11] = "siena";
        int x;

        do{
            System.out.println("Bem-Vindo a locação de carros AutoLima");
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Olá "+nome+", o que você desja realizar?");
            System.out.println("Menu");
            System.out.println("1- Cadastrar automóveis \n2- Mostrar opções de carros disponíveis \n3- Alugar um automóvel \n4- Sair");
            x= sc.nextInt();
            switch (x){
                case 1: cadastrarCarro(carro);
                break;
                case 2: mostarCarros(carro);
                break;
                case 3: alugarCarro(carro);
                break;
                case 4:
                    System.out.println("Saindo do sistema!");
                    sc.close();
                break;
            }
        }while (x<4);
    }

    public static void cadastrarCarro(String carro[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o modelo de carro");
        String modelo = sc.nextLine();
        for(int i = 0; i < 20; i++){
            if(carro[i] == null){
                carro[i] = modelo;
                break;
            }
        }

    }
    public static void mostarCarros(String carro[]){
        for(int i = 0; i < 20; i++){
            if(carro[i] != null) {
                System.out.println(carro[i]);
            }
        }
    }
    public static void alugarCarro(String carro[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de carro");
        int modelo = sc.nextInt();
        System.out.println("Este é o modelo de carro que você está pro curando?");
        System.out.println(carro[modelo]);
    }
}
