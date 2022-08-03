
package BTBuoi4;

import java.util.Scanner;

public class NhanVien {
    Scanner sc= new Scanner(System.in);
    private int MaNV;
    private String TenNV ;
    private int Tuoi ;
    private String DiaChi;
    private String BoPhan;

    public NhanVien() {
        MaNV =0;
        MaNV++;
    }
    public void input(){
        System.out.print("Nhap ten NV :");
        TenNV=sc.nextLine();
        System.out.print("Nhap tuoi NV :");
        Tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi NV :");
        DiaChi=sc.nextLine();
        System.out.print("Nhap bo phan NV :");
        BoPhan=sc.nextLine();
        
    }
    public void output(){
        System.out.printf("%-20d%-20s%-20d%-20s%-20s", MaNV, TenNV,Tuoi,DiaChi,BoPhan);
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        System.out.println("NHAP VAO THONG TIN :\n");
        NhanVien a = new NhanVien();
        NhanVien b = new NhanVien();
        NhanVien c = new NhanVien();
        NhanVien d = new NhanVien();
        NhanVien e = new NhanVien();
        a.input();
        b.input();
        c.input();
        d.input();
        e.input();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "MaNV", "TenNV", "Tuoi", "DiaChi", "BoPhan");
        a.output();
        b.output();
        c.output();
        d.output();
        e.output();
    }

 }
