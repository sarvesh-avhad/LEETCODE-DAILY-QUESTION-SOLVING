class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==1) return strs[0];
        if(n==0) return "";
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1]; 
        
        for(int i=0;i<first.length();i++){
            if( first.charAt(i) == last.charAt(i) ) {
                sb.append(first.charAt(i));
            }
            else return sb.toString();
        }
    return sb.toString();
    }
}
