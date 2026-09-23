class Solution {
    public int[] twoSum(int[] nums, int target) {

        
        int somaTudo = 0;
        
        
            for(int i = 0; i < nums.length;){
                

                for(int j = 1; j < nums.length; j++){
                    
                    if (j == nums.length){
                        i++;
                    }

                    somaTudo = nums[i] + nums[j];
                    if (somaTudo == target){
                        nums[0] = i;
                        nums[1] = j;
                        break;
                    }
                    
                }
            }
                    
                
            
        return nums;
        
        
    }
}

public class SolutionTesteDrive2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 4};
        int target = 6;

        Solution solution = new Solution();

        solution.twoSum(nums, target);
    }
}  
    

