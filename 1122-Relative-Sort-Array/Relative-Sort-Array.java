class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int arr[] = new int[arr1.length];
        int idx = 0;

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    arr[idx++] = arr2[i];
                } 
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num:arr2){
            set.add(num);
        }
        Arrays.sort(arr1);

        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                    arr[idx] = arr1[i];
                    idx++;
                }
        }
    return arr;
    }
}
