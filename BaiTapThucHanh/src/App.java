

import HinhHoc.hinhchunhat;
import HinhHoc.hinhtron;
import HinhHoc.hinhtru;
import HinhHoc.hinhvuong;

public class App {
    public static void main(String[] args){
        hinhtron htr = new hinhtron();
        htr.xuatten();
        htr.nhapbankinh();
        htr.tinhchuvi();
        htr.tinhdientich();
        htr.inchuvi();
        htr.inDientich();

        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapbankinh();
        htru.nhapchieucao();
        htru.tinhThetich();
        htru.inThetich();

        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.inDientich();

        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.inDientich();

        
    
    }
}

       