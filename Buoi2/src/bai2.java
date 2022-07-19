package bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap vao do dai 3 canh a,b,c:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if (a + b > c && a + c > b && b + c > a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong");
            } else if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println( "Day la tam giac can");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println( "Day la tam giac tu");
            } else {
                System.out.println( "Day la tam giac nhon");
            }
        } else {
            System.out.println("a,b,c khong phai do dai 3 tam giac ");
            System.out.print("Vui long nhap lai do dai 3 canh a,b,c:");
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
        }
    }
}