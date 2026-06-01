class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      for(String str : strs){
         char[] toCharArray = str.toCharArray();
         Arrays.sort(toCharArray);
         String label = new String(toCharArray);

         if(!map.containsKey(label)){
            map.put(label, new ArrayList<>());
         }
         map.get(label).add(str);
      }

      return new ArrayList<>(map.values());
    }
}
