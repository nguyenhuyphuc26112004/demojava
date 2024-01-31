import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("nhap vao so dong cua ma tran:");
        m = scanner.nextInt();
        System.out.println("nhap vao so cot cua ma tran: ");
        n = scanner.nextInt();
        int A[][] = new int [m][n];
        System.out.println("nhap cac phan tu cho mang: ");
        for(int i = 0; i < m; i++){
            for(int j =0; j < n; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(max < A[i][j])
                    max = A[i][j];
            }
        }
        System.out.println("phan tu lon nhat trong ma tran la: " + max);
    }
}
