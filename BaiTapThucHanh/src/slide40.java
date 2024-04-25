import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay = scanner.nextInt();
        switch(ngay){
            case 0: System.out.println("chu nhat");
            break;
            case 1: System.out.println("thu hai");
            break;
            case 2: System.out.println("thu ba");
            break;
            case 3: System.out.println("thu tu");
            break;
            case 4: System.out.println("thu nam");
            break;
            case 5: System.out.println("thu sau");
            break;
            default:System.out.println("so ngay");
        }
    scanner.close();
    }
}