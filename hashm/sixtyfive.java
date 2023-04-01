
import java.util.*;
    public class sixtyfive{
    static class hashmap<k,v>{
        private class node{
            k key;
            v value;

            public node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<node> bucket[];
        public hashmap(){
            this.N=4;
            this.bucket=new LinkedList[4]; 
            for(int i=0;i<4;i++){
                this.bucket[i]=new LinkedList<> ();
            }
        }
        private int hashfunction(k key){
            int b=key.hashCode();
            return Math.abs(b)%N;
        }
        private int search(k key,int b){
            LinkedList<node> ll=bucket[b];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<node> oldbucket[]=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0;i<2*n;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<node> ll=oldbucket[i];
                for(int j=0;j<ll.size();j++){
                    node e=ll.get(j);
                    puti(e.key,e.value);
                }            }
        }
        public v remove(k key){
            int b = hashfunction(key);
            int d = search(key,b);
            if(d==-1){
                return null;
            }else{
                node data=bucket[b].remove(d);
                return data.value;
            }
        }
        public boolean conatinskey(k key){
            int b = hashfunction(key);
            int d = search(key,b);
            if(d==-1){
                return false;
            }else{
                return true;
            }
        }
        public v get(k key){
            int b = hashfunction(key);
            int d = search(key,b);
            if(d==-1){
                return null;
            }else{
                node data=bucket[b].get(d);
                return data.value;
            }
        }
        public ArrayList<k> keySet(){
            ArrayList<k> keys=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){
                LinkedList<node> ll=bucket[i];
                for(int j=0;j<ll.size();j++){
                    node e=ll.get(j);
                    keys.add(e.key);
                }
            }
            return keys;
        }
        public void puti(k key, v value){
            int b = hashfunction(key);
            int d = search(key,b);
            if(d==-1){
                bucket[b].add(new node(key,value));
                n++;
            }else{
                node data=bucket[b].get(d);
                data.value=value;
            }
            double lamda=(double)n/N;
            if(lamda>2.0){
                rehash();
            }
        }
    }
    public static void main(String args[]){
        hashmap<String,Integer> map=new hashmap<>();
        map.puti("india",190);
        map.puti("aus",200);
        map.puti("can",100);

        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}