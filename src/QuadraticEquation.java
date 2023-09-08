import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double  getDiscriminant(){
        double delta = b*b - 4 * a * c;
        return delta;
    }
    public double getRoot1(){
        double r1 = -b + Math.pow(getDiscriminant(), 0.5) / (2 * a);
        return r1;
    }
    public double getRoot2(){
        double r2 = -b - Math.pow(getDiscriminant(), 0.5) / (2*a);
        return r2;
    }
    public double getRoot(){
        double r = -b / (2 * a);
        return r;
    }

}
class Main4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a");
        double gt1 = input.nextDouble();
        System.out.println("nhập b");
        double gt2 = input.nextDouble();
        System.out.println("nhập c");
        double gt3 = input.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(gt1,gt2,gt3);
        if (pt1.getDiscriminant() < 0){
            System.out.println("phương trình vô nghiệm");
        }
        else if (pt1.getDiscriminant() == 0){
            System.out.println("phương trình có 1 nghiệm: " + pt1.getRoot());
        }
        else {
            System.out.println("phương trình có 2 nghiệm" + "nghiệm 1 là: " + pt1.getRoot1() + "nghiệm 2 là: " + pt1.getRoot2());
        }
    }
}
