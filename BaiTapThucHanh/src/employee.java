import java.util.Scanner;

public class employee extends person{
    public float luong;
    public float tglam;
    public void nhaptglam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thoi gian lam viec: ");
        tglam = sc.nextFloat();
        sc.close();
    }
    
    public void inluong(){
        System.out.println("Luong = " + luong);
    }
    public static void main(String[] args) {
        employee em = new employee();
        em.nhapthongtin();
        em.hienthi();
        em.nhaptglam();
        em.inluong();
    }
}
