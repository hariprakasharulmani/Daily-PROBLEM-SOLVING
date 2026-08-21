class Solution {
    public boolean isSameAfterReversals(int num) {
        // String s1 = Integer.toString(num);
        // StringBuilder sb = new StringBuilder(s1);
        // String s2 = sb.reverse().reverse().toString();
        // return s1.equals(s2);
        int rev2 = rev(rev(num));
        return num==rev2; 

    }
    public int rev(int n){
        int rev = 0;
        while(n!=0){
            rev = rev * 10 + (n%10);
            n/=10;
        }

        return rev;
    }
}
