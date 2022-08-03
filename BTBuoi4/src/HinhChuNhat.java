
package BTBuoi4;

import java.util.Scanner;

public class HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    private double chieuDai;
    private double chieuRong;

    

    public double DienTich(){
        double Dientich;
        Dientich = chieuDai * chieuRong;
        return Dientich;
    }

    public double ChuVi(){
        double chuvi;
        chuvi = (chieuDai + chieuRong) * 2;
        return chuvi;
    }



    public void setChieuDai(double chieuDais){
        if(chieuDais > 0){
            chieuDai = chieuDais;
        }
    }

    public double getChieuDai(){
        return chieuDai;
    }

    public void setChieuRong(double chieuRongs){
        if(chieuRongs > 0){
            chieuRong = chieuRongs;
        }
    }

    public double getChieuRong(){
        return chieuRong;
    }
    public void input(){
        System.out.print("Chieu dai HCN a: ");
        chieuDai = sc.nextDouble();
        System.out.print("Chieu rong HCN a: ");
        chieuRong = sc.nextDouble();
        
    }
        public void output(){
        System.out.println("\nChu vi hcn : " + ChuVi());
        System.out.println("\nDien tich hcn : \n" + DienTich());
        System.out.printf("%-10f%-10f%-10f%-10f" , chieuDai , chieuRong , DienTich(),ChuVi());
    }

    public static void main(String[] args) {
        HinhChuNhat HcnA = new HinhChuNhat();
        HinhChuNhat HcnB = new HinhChuNhat();
        System.out.println("Nhap thong tin HCN A :");
        HcnA.input();
        System.out.println("HCN a có chieu dai, chieu rong, dien tich, chu vi lan luot la:  ");
        System.out.printf("Chieu dai cua HCN A : \n"+ HcnA.getChieuDai());
        System.out.printf("Chieu rong cua HCN A : \n"+ HcnB.getChieuDai());
        HcnA.output();
        System.out.println("Nhap thong tin HCN B : ");
        HcnB.setChieuDai(37);
        HcnB.setChieuRong(33);
        System.out.println("Chieu dai HCN B: \n"+HcnB.getChieuDai());
        System.out.println("Chieu rong HCN B: \n" +HcnB.getChieuRong());
        System.out.print("\n");
        System.out.println("HCN B có chieu dai, chieu rong, dien tich, chu vi lan luot la:  ");
        HcnB.output();
        System.out.print("\n");
        if(HcnA.DienTich() > HcnB.DienTich()) System.out.println("HCN A co dien tich lon hon");
        else if(HcnA.DienTich() < HcnB.DienTich())System.out.println("HCN B co dien tich lon hon");
        else System.out.println("Hai HCN co dien tich bang nhau");
    }
}
