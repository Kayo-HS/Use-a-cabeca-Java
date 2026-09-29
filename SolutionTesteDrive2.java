//import java.util.Arrays;

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
        int[] nums = {2, 4, 5, 6,6, 8,10,12,10,7, 30, 40,6};
        int target = 13;

        Solution solution = new Solution();

        solution.twoSum(nums, target);
        System.out.println(nums[0]);
        System.out.println(nums[1]);


        
    }
    
}  

    

