class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            } else {
                map.put(n,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int n:map.keySet()){
            if(map.get(n)>(m/3)){
                list.add(n);
            }
        }
    return list;
    }
}
