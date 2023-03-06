import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N,K,result;
        N = scanner.nextInt();
        K = scanner.nextInt();

        result = K/N;
        System.out.println(result);
    }
}