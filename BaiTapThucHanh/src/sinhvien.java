public class sinhvien {
    private String ten;
    private String tuoi;
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        if(ten == null || ten.isEmpty()){
            ten = "khong biet";
        }
        else{
            this.ten = ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1){
            return tuoi;
        }
        else {
            return "tuoi k hop le";
        }
    }
    public void setTuoi(int tuoi){
        if(tuoi > 18){
            this.tuoi = String.valueOf(tuoi);
        }
        else {
            this.tuoi = String.valueOf(-1);
        }
    }
    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien();
        sinhvien sv2 = new sinhvien();

        sv1.setTen("");
        sv1.setTuoi(20);

        sv2.setTen("A");
        sv2.setTuoi(30);

        System.out.println("SInh vien 1 co ten: " + sv1.getTen()  + ", tuoi " + sv1.getTuoi());
        System.out.println("SInh vien 2 co ten: " + sv2.getTen()  + ", tuoi " + sv2.getTuoi());
    }
}


