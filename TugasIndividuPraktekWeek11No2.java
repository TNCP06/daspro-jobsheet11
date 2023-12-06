import java.util.Scanner;

public class TugasIndividuPraktekWeek11No2 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int N = 0;
        do {
            System.out.print("Masukkan nilai N(min. 5): ");
            N = sc27.nextInt();
        } while (N < 5);

        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}