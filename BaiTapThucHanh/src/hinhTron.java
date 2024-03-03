import java.util.Scanner;


        public class hinhTron {
            public float banKinh;
            public final float PI = 3.14f;
            public float chuVi;
            public float DienTich;
        public void nhapbanKinh(){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ban kinh hinh tron: ");
            banKinh = sc.nextFloat();
        }
        public void tinhchuVi(){
            chuVi = 2 * PI * banKinh;
        }
        public void tinhDienTich(){
            DienTich = PI * banKinh * banKinh ;
        }    
        public void inchuVi(){
            System.out.println("Chu Vi: " + chuVi);
        }
        public void inDienTich(){
            System.out.println("Dien Tich = " + DienTich);
        }   
    }

    
