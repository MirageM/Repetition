class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return s1.substring(0, index);
    }
}