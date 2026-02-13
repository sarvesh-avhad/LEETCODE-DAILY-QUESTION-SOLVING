class Solution {
    public boolean check(int[] nums) {
        int idx = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                idx = i;
                break;
            }
        }

        if(idx == nums.length || idx == -1) return true;
        if(nums[0]<nums[nums.length-1]) return false;
        
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }

    return true;

    }
}
