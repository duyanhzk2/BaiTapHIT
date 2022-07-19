package bai3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;
        System.out.print("Nhap vao gia tri cua n : ");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac uoc cua n là :" + sum);
    }

}
