public class MaxConsecutiveOnes_485 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		System.out.print(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int temp = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				temp++;
			} else {
				temp = 0;
			}
			result = Math.max(temp, result);
		}
		return result;
    }
    /*
    Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
    */
    
}
