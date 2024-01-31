import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi: ");
        chuoi = scanner.nextLine();
        System.out.println("cac ki tu co trong chuoi la: ");
        for( int i = 0; i<chuoi.length();i++){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }

    }
}
