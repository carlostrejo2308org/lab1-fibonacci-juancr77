
import java.util.Scanner;

public class Fibo {
 
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
       
        int a = 0, b = 1, c, n;
       
        System.out.print("Ingrese el numero de elmentos para la serie: ");
        n = scan.nextInt();
       
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}