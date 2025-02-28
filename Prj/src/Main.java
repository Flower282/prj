import bai1.Circle;
import bai1.Square;
import bai2.Vector;
import bai3.NhanVien;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Circle
        System.out.println("Circle");
        Circle circle = new Circle(5);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        // Square
        System.out.println("Square");
        Square square = new Square(5);
        System.out.println("Square side: " + square.getSide());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        // Vector
        System.out.println("Vector");
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        System.out.println("Vector v1: (" + v1.getX() + ", " + v1.getY() + ", " + v1.getZ() + ")");
        System.out.println("Vector v2: (" + v2.getX() + ", " + v2.getY() + ", " + v2.getZ() + ")");
        System.out.println("Vector v1 + v2: (" + v1.add(v1, v2).getX() + ", " + v1.add(v1, v2).getY() + ", " + v1.add(v1, v2).getZ() + ")");
        System.out.println("Vector v1 - v2: (" + v1.subtract(v1, v2).getX() + ", " + v1.subtract(v1, v2).getY() + ", " + v1.subtract(v1, v2).getZ() + ")");
        System.out.println("Vector v1 * v2: " + v1.dotProduct(v1, v2));
        System.out.println("Vector v1 * 2: (" + v1.multiply(v1, 2).getX() + ", " + v1.multiply(v1, 2).getY() + ", " + v1.multiply(v1, 2).getZ() + ")");

        // NhanVien
        System.out.println("NhanVien");
        NhanVien nhanVien = new NhanVien("Nguyễn Đức Anh", 2.43, 5.58, 100);
        nhanVien.inTTin();

        System.out.println("Có tăng lương?: " + nhanVien.tangLuong(4));
        System.out.println("Lương sau khi tăng: " + nhanVien.tinhLuong());


    }

}