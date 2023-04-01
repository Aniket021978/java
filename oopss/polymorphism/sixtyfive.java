
//complie time 

class Student {
    String name;
    int age;
   
    public void displayInfo(String name) {
        System.out.println(name);
    }
  
    public void displayInfo(int age) {
        System.out.println(age);
    }
  
    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
 }
 public class sixtyfive{

     public static void main(String args[]){
        Student s=new Student();
        s.displayInfo("aniket");
     }
 }
 