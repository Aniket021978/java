
public class fiftysix{
    public static void main(String args[]){
        //0101  pos==2;
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbit=~(bitmask)&n;
        System.out.println(notbit);
}
}
