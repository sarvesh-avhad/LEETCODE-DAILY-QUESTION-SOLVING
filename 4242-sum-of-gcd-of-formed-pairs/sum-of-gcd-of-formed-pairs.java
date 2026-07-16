class Solution {

    public int gcd(int a,int b){
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int prefixGcd[] = new int[nums.length];

        int maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            prefixGcd[i] = gcd(maxSoFar, nums[i]);
        }
        Arrays.sort(prefixGcd);

        int li = 0;
        int ri = prefixGcd.length-1;
        long ans = 0;
        while(li<=ri){
            if(li == ri) return ans;
            ans+=gcd(prefixGcd[li],prefixGcd[ri]);
            li++;
            ri--;
        }
    return ans;
    }
}