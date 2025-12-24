class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String word[] = s.split(" ");
        return word[word.length - 1].length();
    }
}