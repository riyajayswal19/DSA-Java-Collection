package Arrays;

//Given the array nums after the possible rotation and an integer target, return the 
//index of target if it is in nums, or -1 if it is not in nums. 
//You must write an algorithm with O(log n) runtime complexity. 

public class returnTargetIfPresent {
	
	public static int targetArray(int nums[], int target) {
		
		for(int i=0;i<nums.length;i++){
			if(target == nums[i]){
				return nums[target] ;
			}
				
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int nums[] ={4, 5, 6, 7, 0, 1, 2};
		int target = 5; 
		System.out.println(targetArray(nums,target));
		
	}

}
