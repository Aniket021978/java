public class ins{
    public static class node{
        node[] children;
        boolean eow;
        public node(){
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
        node c=root;   //due to static root value will be changed so we have stored root value in curry;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            node node=c.children[idx];
            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            c=c.children[idx];
        }
        return true;
    }
    public static void main(String args[]){
        String words[]={"there","the","their","ani"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("therie"));
        System.out.println(search("ani"));
    }
}