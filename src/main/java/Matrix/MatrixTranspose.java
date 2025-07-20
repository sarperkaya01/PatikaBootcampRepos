package Matrix;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Örnek matris (3x2)
        Scanner sc = new Scanner(System.in);
        System.out.println("Matris satir sayisi yaziniz :");
        int satir= sc.nextInt();
        System.out.println("Matris stun sayisi yaziniz :");
        int stun= sc.nextInt();

        int[][] matrix = new int[satir][stun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < stun; j++) {
                System.out.println(i+".satir"+j+".stun sayisi yaziniz :");
                int indexSayi = sc.nextInt();
                matrix[i][j]=indexSayi;
            }
        }
        int[][] transpoz = new int[stun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < stun; j++) {
                transpoz[j][i] = matrix[i][j];
            }
        }
        // Original matrix yazdır
        System.out.println("OriginalMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // Transpozu yazdır
        System.out.println("Transpoz:");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
