class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int temp[] = Arrays.copyOf(arr, arr.length);

        Arrays.sort(temp); // 10 20 30 40 

        HashMap<Integer,Integer> map = new HashMap<>();

        int n = 1;     // 
        for(int i=0;i<temp.length;i++){  // 10->1  20 -> 2 30-> 3 40-> 4
            if(map.containsKey(temp[i])) map.put(temp[i],map.get(temp[i]));
            else map.put(temp[i],n++);
        }

        int ans[] = new int[arr.length];
        for(int i=0;i<temp.length;i++){
            ans[i] = map.get(arr[i]);
        }


    return ans;

    }
}