
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 class EquilateralTriangle extends Triangle {
    int side;
 }
 public class sixtyeight{
    public static void main(String args[]){
        EquilateralTriangle s=new EquilateralTriangle();
        s.area(2,4);
    }
}  