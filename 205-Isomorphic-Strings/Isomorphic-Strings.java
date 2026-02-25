class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] alpha = new int[256];
        int[] bita = new int[256];

        for(int i=0;i<s.length();i++){
            if(alpha[s.charAt(i)] != bita[t.charAt(i)] ) return false;

            alpha[s.charAt(i)] = i+1;
            bita[t.charAt(i)] = i+1;           
        }

    return true;
    }
}
