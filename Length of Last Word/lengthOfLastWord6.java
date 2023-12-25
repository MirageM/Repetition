class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int first = 0;
        while(index > 0){
            if(s.charAt(index) != ' ' && s.charAt(index - 1) == ' '){
                first = index;
                break;
            }
            index--;
        }
        return s.substring(first).trim().length();
    }
}