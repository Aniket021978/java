class fourtysix{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int first=i;
            int back=sb.length()-1-i;

            char firstchar=sb.charAt(first);
            char backchar=sb.charAt(back);

            sb.setCharAt(first,backchar);
            sb.setCharAt(back,firstchar);

        }
        System.out.println(sb);
    }
}