import java.util.Scanner;

public class Bai3_Slide93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap nam sinh : ");
        int namsinh = scanner.nextInt();
        int tuoi = 2024 - namsinh ;
        if (tuoi < 16) 
            System.out.println("Ban " + ten + " o độ tuoi vi thanh nien.");
        else if (tuoi >= 16 && tuoi < 18) 
            System.out.println("Ban " + ten + " o đo tuoi truong thanh.");
        else 
            System.out.println("Ban " + ten + " da gia.");
    }
}
