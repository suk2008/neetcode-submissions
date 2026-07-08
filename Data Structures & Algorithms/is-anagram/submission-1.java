class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        int[] ana = new int[256];
        for(char c : s.toCharArray()){
            ana[c-'a']++;
        }
        for(char c : t.toCharArray()){
            ana[c-'a']--;
        }
        // boolean value = maps.values().stream().allMatch(v->v==0);
        for(int count : ana){
            if(count!=0)    return false;
        }
        return true;

    }
}
