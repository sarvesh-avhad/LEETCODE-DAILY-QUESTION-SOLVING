class Solution {
    public void sortColors(int[] nums) {
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) num0++;
            else if(nums[i] == 1) num1++;
            else num2++;
        }

        int i = 0;
        while(num0 != 0 && i != nums.length){
            nums[i] = 0;
            i++;
            num0--;
        }

        int j = i;
        while(num1 != 0 && j != nums.length){
            nums[j] = 1;
            num1--;
            j++;
        }

        int k = j;
        while(num2 != 0 && k!= nums.length){
            nums[k] = 2;
            k++;
        }
    return;        
    }
}
