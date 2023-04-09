import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner entrada= new Scanner(System.in);

        double raio;
        double area; 
        double pi;
        pi = 3.14;
        
       
        System.out.print("Digite o valor do raio: ");
        raio = entrada.nextDouble();
        area = 2 * pi * raio;
        System.out.print("o raio é: " + area);


    }
}
