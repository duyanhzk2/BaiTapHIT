package BTBuoi4;

import java.util.Scanner;

public class Employee{

    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    public int PRICE = 50;

    Scanner sc = new Scanner(System.in);
    private String maNV;
    private String tenNV;
    private int tuoi;
    private int NgayLV;
    private double Luong;

    private Employee() {
        id = maNV;
        name = tenNV;
        age = tuoi;
        workingDays = NgayLV;
        salary = Luong;
    }

    public int setsalary() {
        return (workingDays * PRICE);
    }

    public double getsalary() {
        return salary;
    }

    public void setID(String ids) {
        id = ids;
    }

    public String getID() {
        return id;
    }

    public void setname(String names) {
        name = names;
    }

    public String getname() {
        return name;
    }

    public void setage(double ages) {
        age = (int) ages;
    }

    public int getage() {
        return age;
    }

    public void setworkingDays(int workingDayss) {
        workingDays = workingDayss;
    }

    public int getworkingDays() {
        return workingDays;
    }

   

    public void input() {
        System.out.print("Nhap vao id :");
        id = sc.nextLine();
        System.out.print("Nhap ten :");
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi :");
        age = sc.nextInt();
        System.out.print("Nhap vao so ngay lam viec :");
        workingDays = sc.nextInt();
        setsalary();
    }

    public void output() {
        System.out.printf("%-20s%-20s%-20d%-20d%-20f\n", id, name, age, workingDays, salary);

    }

    public static void main(String[] args) {
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();
        a.input();
        b.input();
        c.input();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s", "maNV", "tenNV", "tuoi", "NgayLV", "Luong");
        a.output();
        b.output();
        c.output();

    }
}
