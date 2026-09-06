class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs)
        {
            sb.append(str.length());
            sb.append('#');
            char[] myArray = str.toCharArray();
            for(char ch : myArray)
            {
               sb.append(ch);
            }

        }
        return sb.toString();

    }

    public List<String> decode(String str) {
           List<String> strs = new ArrayList<>();
            char[] myArray = str.toCharArray();
            for(int i=0;i<myArray.length;)
            {
                StringBuilder sbin =new StringBuilder();
                while(myArray[i]!='#')
                {
                    sbin.append(myArray[i]);
                    i++;
                }
                int length= Integer.valueOf(sbin.toString());
                i=i+1;
                int terminal= i+length;
                StringBuilder sb = new StringBuilder();
                for(;i<terminal;i++)
                {
                    sb.append(myArray[i]);
                }
                System.out.println(sb.toString());
                strs.add(sb.toString());
            }
            return strs;
    }
}
