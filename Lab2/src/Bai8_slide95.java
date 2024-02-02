import java.util.Scanner;

public class Bai8_slide95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        float avg;
        System.out.println("nhap so luong phan tu cua day: ");
        n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("nhap cac phan tu cua day");
        for( int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        avg = (float) sum/n;
        System.out.println("trung binh cong cua day la: "+avg);
    }
}
