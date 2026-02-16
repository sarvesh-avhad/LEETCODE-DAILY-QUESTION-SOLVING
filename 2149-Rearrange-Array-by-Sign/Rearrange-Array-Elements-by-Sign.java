class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        int[] pos = new int[n/2];
        int x = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[x] = nums[i];
                x++;
            }
        }
        
        int[] neg = new int[n/2];
        int y = 0;
        for(int i=0;i<n;i++){
                if(nums[i]<0){
                    neg[y] = nums[i];
                    y++;
                }
        }

        int j = 0;
        for(int i=0;i<n;i+=2){
            arr[i] = pos[j++];
        }

        int k = 0;
        for(int i=1;i<n;i+=2){
            arr[i] = neg[k++];
        }
    return arr;
    }
}
