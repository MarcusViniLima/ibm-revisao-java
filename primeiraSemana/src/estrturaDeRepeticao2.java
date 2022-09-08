
public class estrturaDeRepeticao2 {
        public static void main(String[] args) {
            System.out.println("Segue abaixo a tabuada de 0 a 10:");
            for(int i = 1; i <=10; i++){
                System.out.println("Tabuada do "+i);
                for(int j = 0; j<=10; j++) {
                    int resultado = i*j;
                    System.out.println(i+"*"+j+"="+resultado);
                }
            }
        }
}
