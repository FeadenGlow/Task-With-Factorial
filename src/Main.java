import java.util.Scanner;

public class Main {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        Recurtion r = new Recurtion();
        int number = sc.nextInt();
        System.out.println(r.getFactorial(number));
    }
}
