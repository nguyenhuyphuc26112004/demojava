import java.util.Scanner;

public class NHP108Person {
    String hoten;
    int tuoi;
    String quequan;
    
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("NHap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap que quan: ");
        quequan = sc.nextLine();
    }

    public void xuatthongtin(){
        System.out.println("Ho ten: " +hoten);
        System.out.println("Tuoi: " +tuoi);
        System.out.println("Que quan: ");
    }

    public static void main(String[] args) {
        NHP108Person nhp = new NHP108Person();
        nhp.nhapthongtin();
        nhp.xuatthongtin();
    }
    
    

}
