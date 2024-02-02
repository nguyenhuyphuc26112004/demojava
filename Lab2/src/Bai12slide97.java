import java.util.Scanner;

public class Bai12slide97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("nhap so dong cua ma tran");
        m = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.println("nhap cac phan tu cho ma tran");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++)
                A[i][j] = scanner.nextInt();
        }
        int max = A[0][0];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if (max <  A[i][j] )
                    max = A[i][j];
            }
        }
        System.out.println("phan tu lon nhat la " + max);
    }
}
