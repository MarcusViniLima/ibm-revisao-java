import java.util.Scanner;

public class Mutiplicacao {
    Scanner sc = new Scanner(System.in);
    private double x, y;

    public void realizarmutiplicacao(){
        System.out.println("Digite o primeiro valor:");
         x = sc.nextDouble();
        System.out.println("Digite o segundo valor");
         y = sc.nextDouble();
        double resultado = x * y;
        System.out.println("O resultado da operação é: "+resultado);
    }
}
