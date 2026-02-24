class Solution {
    public int findKthPositive(int[] arr, int k) {
        int answer = 0;
        HashSet<Integer> set = new HashSet();

        for(int n:arr){
            set.add(n);
        }
        int idx = 0;
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if( !set.contains(i)){
                answer = i;
                idx++;
            }
            if(idx == k) break;
        }
    return answer;
    }
}
