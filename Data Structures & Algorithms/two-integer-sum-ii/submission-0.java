class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int esq = 0;
        int dir = numbers.length -1;

        while(esq < dir){
            int sum = numbers[esq] + numbers[dir];
            if(sum == target){
                break;
            }
            
            if(sum > target){
                dir--;
            }

            if(sum < target){
                esq++;
            }

        }
       return new int[]{esq + 1, dir +1}; 
    }
}
