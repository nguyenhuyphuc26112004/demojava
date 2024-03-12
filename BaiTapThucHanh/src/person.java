import java.util.Scanner;

public class person {
    public String HoTen;
    public int tuoi;
    public String quequan;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.println("Tuoi: ");
        tuoi = sc.nextInt();
        
    }
    public void nhapquequan(){

        Scanner sc = new Scanner(System.in);
        System.out.println("que quan:");
        quequan = sc.nextLine();
    }
    
    public void hienthi(){
        System.out.println(HoTen + "-" + tuoi + "-" +quequan);
        

    }
    public void hienthi(String name , int age , String Dc){
        System.out.println("Ho ten: " +name);
        System.out.println("Tuoi: " +age);
        System.out.println("Que Quan: " +Dc);
    }
    public person(){
        HoTen = "nguyen van a";
        tuoi = 20;
        quequan = "hn";
    }
    
}
