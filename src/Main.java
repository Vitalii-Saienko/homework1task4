import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number, that consists in 3 digits:");
        int number = sc.nextInt();
        System.out.println("first digit is: " + number/100);
        System.out.println("second digit is: " + number/10%10);
        System.out.println("third digit is: " + number%10);
    }
}