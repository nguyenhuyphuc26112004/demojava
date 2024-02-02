import java.util.Scanner;

public class Bai9_slide96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi= new String();
        System.out.print("nhap chuoi ky tu: ");
        chuoi=scanner.nextLine();
        int demthuong=0;
        int demhoa=0;
        int demso=0;
        for(int i=0;i< chuoi.length();i++){ 
            if((chuoi.charAt(i)>='a')&&(chuoi.charAt(i)<+'z'))
            demthuong++;
            if((chuoi.charAt(i)>='A')&&(chuoi.charAt(i)<+'Z'))
            demhoa++;
            if((chuoi.charAt(i)>='0')&&(chuoi.charAt(i)<+'9'))
            demso++;
        }
        System.out.println("so ky tu thuong trong chuoi la: "+demthuong );
        System.out.println("so ky tu hoa trong chuoi la: "+demhoa );
        System.out.println("so ky tu so trong chuoi la: "+demso );
    }
}                