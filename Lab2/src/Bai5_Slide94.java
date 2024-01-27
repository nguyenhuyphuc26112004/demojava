import java.util.Scanner;

public class Bai5_Slide94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        while (true) {
            System.out.print("Nhap vao mot so nguyen: ");
            int songuyen = sc.nextInt();
            tong = tong + songuyen;

            if (tong > 100) {
                System.out.println("Tong cac so vuot qua 100: " + tong);
                break;
            }
        }

        sc.close();
    }
}
