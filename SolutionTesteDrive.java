class Solution {
    public int[] twoSum(int[] nums, int target) {

        int soma = 0;
        int soma2 = 0;
        int somaTudo = 0;
        
        
            for(int i = 0; i < nums.length;){
                soma = 0;
                soma2 = 0;
                if (nums[i] < target){
                    soma += nums[i];
                    
                    
                    
                }
                if (nums[i+1] < target){
                    soma2 += nums[i+1];
                    
                    

                    somaTudo = soma + soma2;
                }
                if (somaTudo == target){
                    System.out.println(nums);
                    nums[0] = i;
                    nums[1] = i + 1;
                    i++;
                }
            }
                
            
        return nums;
        
    }
}

public class SolutionTesteDrive {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 4};
        int target = 6;

        Solution solution = new Solution();

        solution.twoSum(nums, target);
    }
}  
    

