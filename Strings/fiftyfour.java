
public class fiftyfour{
    public static void main(String args[]){
        //0101  pos==2;
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.println("zero");
        }else{
            System.out.println("one");
        }
}
}
