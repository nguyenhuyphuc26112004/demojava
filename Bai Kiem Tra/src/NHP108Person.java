import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class NHP108Person {
    String hoten;
    int tuoi;
    String quequan;
    int n;
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
    
    public void nhapsophantu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        n = sc.nextInt();
    }
    
    ArrayList<Integer> arrList = new ArrayList<>();
    
    public void them(){
        
        for(int i = 0; i < n; i++){
            arrList.add(null);
        }
    }
    public void sua(){
        for(int i = 0; i < n; i++){
            arrList.get(i);
        }
    }
    public void xoa(){
        for(int i = 0; i < n; i++){
            
            arrList.remove("");

        }
    }
    public static void main(String[] args) {
        NHP108Person nhp = new NHP108Person();
        nhp.nhapthongtin();
        nhp.xuatthongtin();
        nhp.nhapsophantu();
        nhp.them();
        arrList.them();
        nhp.sua();
        arrList.sua();
        nhp.xoa();
        arrList.xoa();
    }
    
    

}
