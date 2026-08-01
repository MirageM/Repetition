class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> dict1 = new HashMap<>();
        Map<Character, Integer> dict2 = new HashMap<>();
        for(char c: s.toCharArray()){
            dict1.put(c, dict1.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()){
            dict2.put(c, dict2.getOrDefault(c, 0) + 1);
        }
        return dict1.equals(dict2);
    }
}