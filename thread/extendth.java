public class extendth extends Thread{
    public void run(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        extendth ex=new extendth();
        ex.start();
    }
}