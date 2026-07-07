class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        Map<Character, Integer> maps = new HashMap<>();
        for(char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()){
            if(maps.containsKey(c))
                maps.put(c, maps.get(c)-1);
        }
        boolean value = maps.values().stream().allMatch(v->v==0);
        if(value)  return true;

        return false;

    }
}
