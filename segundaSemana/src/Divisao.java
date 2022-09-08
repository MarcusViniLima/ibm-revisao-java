import java.util.Scanner;

public class Divisao {
    Scanner sc = new Scanner(System.in);
    private double x, y;
    public void realizarDivisao(){
        System.out.println("Digite o primeiro valor:");
         x = sc.nextDouble();
        System.out.println("Digite o segundo valor");
         y = sc.nextDouble();
        double resultado = 0;
        double resto = 0;
        if(y != 0) {
            resultado = x / y;
            resto = x % y;
            System.out.println("O resultado da operação é: "+resultado +
                    " e o resto é: "+resto);
        } else{
            System.out.println("Não é possível realizar operação com divisor = 0.");
        }
    }
}
