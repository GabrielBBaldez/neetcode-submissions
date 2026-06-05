class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();   
        for (int i = 0; i < nums.length; i++) {
            int esq = i + 1;
            int dir = nums.length - 1;
            while (esq < dir) {
                int sum = nums[i] + nums[esq] + nums[dir];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[esq], nums[dir]));
                    esq++;
                    dir--;
                } else if (sum > 0) {
                    dir--;
                } else {
                    esq++;
                }
            }
        }
        return new ArrayList<>(set);  
    }
}