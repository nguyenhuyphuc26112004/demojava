import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        int firstNumber , secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so thu nhat:");
        firstNumber = scanner.nextInt();
        System.out.println("nhap vao so thu hai:");
        secondNumber = scanner.nextInt();
        int minNumber = firstNumber;
        if(firstNumber > secondNumber)
            minNumber = secondNumber;
        System.out.println("so nho nhat trong hai so " + firstNumber + " va " + secondNumber + " la "+ minNumber);    
        scanner.close();
    }
}
