class Solution {
    int first(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        int idx = -1;
        while(lo<=hi){
            int mid = hi-(hi-lo)/2;
            if(nums[mid] == target){
                idx = mid;
                hi = mid-1;
            } else if(nums[mid] < target){
                lo = mid+1;
            } else {
                hi = mid - 1;
            }
        }
    return idx;
    }

    int last(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        int idx = -1;
        while(lo<=hi){
            int mid = hi-(hi-lo)/2;
            if(nums[mid] == target){
                idx = mid;
                lo = mid+1;
            } else if(nums[mid] < target){
                lo = mid+1;
            } else {
                hi = mid - 1;
            }
        }
    return idx;
    }
    public int[] searchRange(int[] nums, int target) {
    
        int one =  first(nums,target);
        int two = last(nums,target);
        int[] ans = {one,two};     
    return ans;
    }
}
