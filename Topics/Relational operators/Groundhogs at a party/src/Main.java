import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int num;
        boolean isWeekend;

        num = scanner.nextInt();
        isWeekend = scanner.nextBoolean();

        System.out.println(num <= 20 && num >= 10 && !isWeekend || num <= 25 && num >= 15 && isWeekend);

    }
}