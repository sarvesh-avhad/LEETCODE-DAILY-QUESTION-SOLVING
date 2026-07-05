class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<Character> set = new HashSet<>();

        for(char ch: word.toCharArray()){
            set.add(ch);
        }

        int count = 0;

        for(String letters: patterns){
            if (word.contains(letters)) {
                count++;
            }
        }
    return count;
    }
}