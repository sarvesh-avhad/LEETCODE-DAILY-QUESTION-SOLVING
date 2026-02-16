class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos[x++] = nums[i];

            else neg[y++] = nums[i];
        }

        int p = 0;
        int 1 = 0;
        for(int i=0,j=1;i<n && j<n;i+=2,j+=2){
            arr[i] = pos[p++];
            arr[j] = neg[q++];
        }
    return arr;
    }
}
