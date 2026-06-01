class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();

        for(int number : nums){
            if(num.contains(number)){
              return true;
            }
           num.add(number);
        }
        return false;
    }
}