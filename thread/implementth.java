public class implementth implements Runnable{
    public void run(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        implementth ex=new implementth();
        Thread th=new Thread(ex);
        th.start();
    }
}