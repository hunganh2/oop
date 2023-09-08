import java.util.Arrays;

public class student {
    public String name;
    public int age;
    public int[] diem = new int[3];

    public student(String name, int age, int[] diem){
        this.name = name;
        this.age = age;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diem=" + Arrays.toString(diem) +
                '}';
    }
    public int trungBinh(){
        int sum = 0;
        for (int i = 0; i < this.diem.length; i++) {
            sum += this.diem[i];
        }
        return sum/this.diem.length;

    }
}
class Main3 {
    public static void main(String[] args) {
        student hs1 = new student("hung", 23, new int[]{10,10,10} );
        student hs2 = new student("anh", 22, new int[]{8, 10 ,10});

        System.out.println(hs1);
        System.out.println("diểm trung bình là: " + hs1.trungBinh());
        if (hs1.trungBinh() > hs2.trungBinh()){
            System.out.println(hs1);
        }
        else {
            System.out.println(hs2);
        }
    }
}
