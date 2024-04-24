package Model;

public class TestModel {
    public static void main(String[] args) {
        nvfulltime sep = new nvfulltime("A");
        sep.loaichucvu(configs.nv_sep);
        nvfulltime A = new nvfulltime("A");
        nvfulltime B = new nvfulltime("B", 20);
        nvpartime pt = new nvpartime("C", 200);
        sep.tinhluong();
        ducdat.tinhluong();
        vietanh.tinhluong();
        pt.tinhluong();

        sep.inthongtin();
        A.inthongtin();
        B.inthongtin();
        pt.inthongtin();
    }
}
