import java.util.Scanner;

public class Person1 {
    public String personID;
    public String FullName;
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id = ");
        personID = sc.nextLine();
        System.out.println("Nhap ten: ");
        FullName = sc.nextLine();
        sc.close();
    }

    public void inthongtin()
    {
        System.out.println("ID: " +personID);
        System.out.println("Ten: " +FullName);
    }
}
