import java.util.Arrays;
import java.util.Scanner;

public class Bai11slide97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n; 
        do {
         System.out.println("nhap n : ");
         n = scanner.nextInt();
        }while (n < 0);
        int A[]= new int[n];
        System.out.println("nhap cac phan tu cua n ");
         for (int i=0;i<n;i++){
             System.out.println("phan tu thu " + i +" la ");
             A[i]= scanner.nextInt();
         }
             System.out.println("mang ban dau la ");
            for(int i = 0;i < n; ++i)
             System.out.println(":" + A[i]);
             System.out.println();
         Arrays.sort(A);
              System.out.println("sap xep mang theo thu tu  tang dan ");
         for(int i = 0;i < n; ++i)
             System.out.println(":" + A[i]);
    }
}
