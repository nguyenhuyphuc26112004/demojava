import java.util.Scanner;

public class person {
    public String HoTen;
    public int tuoi;
    public String quequan;
    public String chucvu;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        HoTen = sc.nextLine();
        
        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Que quan: ");
        quequan = sc.nextLine();
        System.out.println("Chuc vu: ");
        chucvu = sc.nextLine();
        sc.close();
    }
    public void hienthi(){
        System.out.println("Ho ten " + HoTen);
        System.out.println("Tuoi " +tuoi);
        System.out.println("Que quan " +quequan);
        System.out.println("Chuc vu " +chucvu);       
    }
    public void hienthi(String name , int age , String Dc){
        System.out.println("Ho ten: " +name);
        System.out.println("Tuoi: " +age);
        System.out.println("Que Quan: " +Dc);
        System.out.println("Chuc vu: " + chucvu);
    }
    public person(){
        HoTen = "nguyen van a";
        tuoi = 20;
        quequan = "hn";
        chucvu = "h";
    }
    public static void main(String[] args) {
        person pes = new person();
        pes.nhapthongtin();
        pes.hienthi();
    }
}

