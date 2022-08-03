package BTBuoi4;

import java.util.Scanner;


public class PhTrinhBac2 {

    private int a;
    private int b;
    private int c;
    public int x ;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Nhap a :");
        a = sc.nextInt();
        System.out.print("Nhap b :");
        b = sc.nextInt();
        System.out.print("Nhap c :");
        c = sc.nextInt();

        }

    public void Timnghiem() {
        float delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.print("\nPhương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("\n Phương trình đã cho có nghiệm kép x ="+ (double)(-b/(2*a)));
        }
        else{
            System.out.print(" \nPhương trình đã cho có 2 nghiệm phân biệt :");
            System.out.printf("\nx1 = " +(double)((-b + Math.sqrt(delta))/2*a));
            System.out.printf("\nx2 = " +(double)((-b - Math.sqrt(delta))/2*a));
        }

    }

    public void output() {
        System.out.printf("Phuong trinh da cho : "  );
        Timnghiem();
    }
    
    public static void main(String[] args){
        PhTrinhBac2 y = new PhTrinhBac2() ;
        y.input();
        y.output();
    }

}