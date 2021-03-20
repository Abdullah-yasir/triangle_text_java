package classes;

public class SampleDriver {
    
    public static void main(String[] args){
        Triangle tri1 = new Triangle("12.23","4","4");
        System.out.println(tri1.triangleType());
        System.out.println("_____________________");

        Triangle tri2 = new Triangle("h","4","4");
        System.out.println(tri2.triangleType());
        System.out.println("_____________________");

        Triangle tri3 = new Triangle("h","g","4");
        System.out.println(tri3.triangleType());
        System.out.println("_____________________");

        Triangle tri4 = new Triangle("100","90","1");
        System.out.println(tri4.triangleType());
        System.out.println("_____________________");

        Triangle tri5 = new Triangle("-100","10","10");
        System.out.println(tri5.triangleType());
        System.out.println("_____________________");

        Triangle tri6 = new Triangle("8","8","1");
        System.out.println(tri6.triangleType());
        System.out.println("_____________________");
    }
}
