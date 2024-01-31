import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
            do{
            System.out.println("nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
            }while(n<0);
        int A[] = new int[n];
        System.out.println("nhap cac phan tu cho mang: ");
        for(int i = 0; i < n; i++){
            System.out.println("nhap phan tu thu "+i +": ");
            A[i] = scanner.nextInt();
            }  
        double tong = 0;
        for(int i=0;i<n;i++){
            if(A[i]%2 == 0);
            tong = tong + A[i];
        } 
        System.out.println("tong: " +tong);    
    }
}
