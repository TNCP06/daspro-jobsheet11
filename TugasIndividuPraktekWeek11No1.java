import java.util.Scanner;

public class TugasIndividuPraktekWeek11No1 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int N = 0;
        do {
            System.out.print("Masukkan nilai N(min. 3): ");
            N = sc27.nextInt();
        } while (N < 3);

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}