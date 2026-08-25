class Solution {
    public String largestEven(String s) {
        // long n = Long.parseLong(s);
        // if(n%2==0) return s;
        // else{
        //     while(n!=0){

        //         long rem = n%10;
        //         if(rem%2==0){
        //             break;
        //         }
        //         n = n/10;
        //     }
        // }
        // if(n==0) return "";
        // return Long.toString(n);
        int n = (s.charAt(s.length()-1)-'0');
        if(n % 2 == 0) return s;
        int num = 0;
        StringBuilder sb = new StringBuilder(s);
        //else{
            for(int i=s.length()-1;i>=0;i--){
                char c = s.charAt(i);
                num = (c)-'0';
                if(num%2==0){
                    break;
                }
                else{
                    sb.deleteCharAt(i);
                }
            }
        //}
        return sb.toString();
    }
}
