import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.print(sum);
    }
}