class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            char key = s.charAt(i);
            int def = map.getOrDefault(key, 0);
            map.put(key, def +1);
        }

        for(int u = 0; u < t.length() ; u++){
            char key = t.charAt(u);
            int def = map.getOrDefault(key, 0);
            if(def == 0){
            return false;
            }
            map.put(key, def -1);
        }



         return true;
    }
}
