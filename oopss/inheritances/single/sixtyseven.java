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
public class sixtyseven{
    public static void main(String args[]){
        Triangle s=new Triangle();
        s.area(2,4);
    }
} 