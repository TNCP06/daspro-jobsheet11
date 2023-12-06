import java.util.Scanner;

public class TugasIndividuPraktekWeek11No3 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int N = 0;
        do {
            System.out.print("Masukkan nilai N(min.3): ");
            N = sc27.nextInt();
        } while (N < 3);

        int M = N-2;
        for (int i = 1; i <= N; i++) {
            System.out.print(N+" ");
            for (int j = 0; j < M; j++) {
                if (i == 1 || i == N) {
                    System.out.print(N+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(N);
        }
    }
}