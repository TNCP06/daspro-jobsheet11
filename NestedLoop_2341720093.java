import java.util.Scanner;

public class NestedLoop_2341720093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        int x = 0;
        for (double[] kotaTemps : temps) {
            double avg = 0;
            System.out.print("Kota ke-"+ (x + 1) +": ");
            for (double i : kotaTemps) {
                System.out.print(i+" ");
                avg += i;
            }

            avg /= kotaTemps.length;
            System.out.println();
            System.out.println("Rata-rata kota ke-"+ (x + 1) + ": " + avg);
            x++;
        }

    }
}