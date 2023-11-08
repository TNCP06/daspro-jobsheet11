import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer > number) {
                    System.out.println("Tebakanmu lebih besar dari jawabannya!");
                } else if (answer < number) {
                    System.out.println("Tebakanmu lebih kecil dari jawabannya!");
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?: ");
            menu = input.next().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}