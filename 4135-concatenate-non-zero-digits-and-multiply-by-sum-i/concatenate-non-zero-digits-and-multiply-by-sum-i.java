class Solution {

    public long reverse(int n){
        long rev = 0;
        while(n>0){
            long ld = n%10;
            rev = rev*10+ld;
            n/=10;
        }
        return rev;
    }
    
    public long sumAndMultiply(int n) {
        int rev = 0;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            if(ld != 0){
                sum+=ld;
                rev = rev*10+ld;
            }
            n/=10;
        }
        return reverse(rev)*sum;
    }
}