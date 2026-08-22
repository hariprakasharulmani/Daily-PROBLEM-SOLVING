class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int o = n;
        while(n!=0){
            digitSum += (n%10);
            digitProduct *= (n%10);
            n/=10; 
        }
        int sum = digitSum + digitProduct;
        //System.out.println(sum);
        return o%sum==0;
    }
}
