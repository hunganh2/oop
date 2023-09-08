public class car {
    public int cannang;
    public String mau;
    public int sobanh;
    public car (int cannang, String mau, int sobanh) {
        this.cannang = cannang;
        this.mau = mau;
        this.sobanh = sobanh;
    }
    public void go(){
        System.out.println(this.mau + "xe dang chay");
    }
}
class Main{
    public static void main(String[] args) {
        car xe = new car(500, "xanh", 4);
        xe.go();
    }
}
