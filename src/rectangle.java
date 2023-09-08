import java.util.Scanner;

public class rectangle {
    public int width;
    public int hig;
    public rectangle(int width, int hig){
        this.width = width;
        this.hig = hig;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", hig=" + hig +
                '}';
    }

    public int chuvi(){
        return (width + hig) * 2;
    }
    public int dienTich( ){
        return width * hig;
    }
}
class Main2{
    public static void main(String[] args) {

//        hcn1.chuvi();
//        hcn1.dienTich();

        Scanner input = new Scanner(System.in);
        System.out.println("nhập width ");
        int width = input.nextInt();
        System.out.println("nhập hig ");
        int hig = input.nextInt();
        rectangle hcn1 = new rectangle (width, hig);
        System.out.println(hcn1);
        System.out.println("chu vi hcn là: " + hcn1.chuvi());
        System.out.println("diện thích hcn là: " + hcn1.dienTich());
    }
}
