import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a;
        int b;
        int n;
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b ; i++) {
            if (i % n == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}