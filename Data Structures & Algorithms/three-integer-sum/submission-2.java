class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {  
                continue;
            }
            int esq = i + 1;
            int dir = nums.length - 1;
            while (esq < dir) {
                int sum = nums[i] + nums[esq] + nums[dir];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[esq], nums[dir]));
                    esq++;
                    dir--;
                    while (esq < dir && nums[esq] == nums[esq - 1]) esq++;  
                    while (esq < dir && nums[dir] == nums[dir + 1]) dir--;  
                } else if (sum > 0) {
                    dir--;
                } else {
                    esq++;
                }
            }
        }
        return res;
    }
}