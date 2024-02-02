import java.util.Scanner;

public class Bai10slide96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = new String();
    String kytu = new String();
    int dem = 0;
    do{
        System.out.print("nhap chuoi ky tu: ");
        chuoi = scanner.nextLine();
    }while(chuoi.length()>80);
    do{
        System.out.print("nhap ky tu: ");
        kytu = scanner.nextLine();
    }while (kytu.length() != 1);
    int x = 1;
    while (( chuoi.indexOf(kytu,x))>0) {
        dem++; 
        x = chuoi.indexOf(kytu,x)+1;  
    }
    System.out.println("so lan xuat hien cua ky tu do la: "+ dem);
    
    }
}
