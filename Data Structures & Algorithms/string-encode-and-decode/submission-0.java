class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb =new StringBuilder();
       for(String str:strs)
        {
            
            sb.append(str.length());
            sb.append('#');
            sb.append(str);

        }     
       return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded= new ArrayList<>();
        for(int x=0;x<str.length();)
        {
            int y=str.indexOf('#',x);
            String leng=str.substring(x,y);
            int length=Integer.parseInt(leng);
            String word=str.substring(y+1,y+length+1);
            decoded.add(word);
            x=y+length+1;
        }
        return decoded;

    }
}
