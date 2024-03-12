import shapes.hinhchunhat;
import shapes.hinhtron;

public class App {
    public static void main(String[] args) throws Exception {
       hinhchunhat hcn = new hinhchunhat();
       hcn.nhapThongTin();
       hcn.tinhchuvi();
       hcn.tinhdientich();
       hcn.InThongTin();

       System.out.println("\n");

       hinhtron ht = new hinhtron();
       ht.nhapbankinh();
       ht.tinhchuvi();
       ht.tinhdientich();
       ht.InThongTin();
       
    }
}
