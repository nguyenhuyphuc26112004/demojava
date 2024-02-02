import java.util.Scanner;

public class Bai6_slide95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,n;
        do{
            System.out.println("nhap n");
            n = scanner.nextInt();
            if(n<0)
            System.out.println("nhap sai nhap lai"); 
        }while(n<0);
        int s = 1;
        for(i = 1; i <= n; i++)
            s = s * i;
        System.out.println("giai thua la: " +s);    

    }
}
