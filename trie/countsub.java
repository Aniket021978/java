public class countsub{
    public static class node{
        node[] children;
        boolean eow;
        node(){
            children=new node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    public static node root= new node();
    public static void insert(String word){
        node c=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(c.children[idx]==null){
                c.children[idx]=new node();
            }
            if(i==word.length()-1){
                c.children[idx].eow=true;
            }
            c=c.children[idx];
        }
    }
    public static boolean search(String key){
        node c=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(i==key.length()-1 && c.children[idx].eow==false){
                return false;
            }
            if(c.children[idx]==null){
                return false;
            }
            c=c.children[idx];
        }
        return true;
    }
    public static int count(node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=count(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.print(count(root));
    }
}