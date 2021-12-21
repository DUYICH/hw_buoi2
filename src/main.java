import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String chuoi1;
        String chuoi2;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi 1 la :");
        chuoi1 = scanner.nextLine();
        System.out.println("nhap vao chuoi 2 la :");
        chuoi2 = scanner.nextLine();
        System.out.println(chuoi1.equals(chuoi2));

        System.out.println(chuoi1.compareTo(chuoi2));

        double diem = diem(4.333333,5.55555);
        System.out.println(diem);
        if (diem >= 6){
            System.out.println("Dat");
        } else {
            System.out.println("TRUOT");
        }

    }

    public static double diem(double a, double b){
        return (a+b)/2;
    }
}
