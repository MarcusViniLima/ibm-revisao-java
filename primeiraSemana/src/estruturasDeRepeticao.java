import java.util.Scanner;
public class estruturasDeRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você quer saber a tabuada:");
        int num1 = sc.nextInt();
        System.out.println("A tabuada do "+num1);

        for(int i = 0; i <= 10; i++){
            int resultado = i*num1;
            System.out.println(num1+"*"+i+"="+resultado);
        }

    }
}
