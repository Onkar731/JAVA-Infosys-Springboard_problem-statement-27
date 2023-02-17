import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // calculaing sum using calculateSum() method of SumN class
        System.out.println(SumN.calculateSum(N));

        // closing resource
        sc.close();
    }    
}
