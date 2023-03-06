import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String first_name, cuisine_preference;
        int year;

        first_name = scanner.next();
        year = scanner.nextInt();
        cuisine_preference = scanner.next();
        System.out.println("The form for "+first_name+" is completed. " +
                "We will contact you if we need a chef who cooks "+cuisine_preference+
                " dishes and has "+year+" years of experience."
        );

    }
}