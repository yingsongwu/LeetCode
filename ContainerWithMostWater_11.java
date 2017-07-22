package com.leetcode;

public class ContainerWithMostWater_11 {

	/**
	 * Given n non-negative integers a1, a2, ..., an, where each represents a
	 * point at coordinate (i, ai). n vertical lines are drawn such that the two
	 * endpoints of line i is at (i, ai) and (i, 0). Find two lines, which
	 * together with x-axis forms a container, such that the container contains
	 * the most water. Note: You may not slant the container and n is at least
	 * 2.
	 * 
	 * 题目的意思是指 给定一个数组 
	 * 取两个只值可以围成的容易装水的最大面积值
	 * 需要考虑到的是 判断最短的那一条边在哪里取到
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height ={1, 8 ,6, 2 ,5, 4 ,8, 3, 7};
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int result = 0;
		int low = 0,high = height.length-1;
		while(low < high){
			result = Math.max(result, (high-low)*Math.min(height[low], height[high]));
			if (height[low] < height[high]) {
				low++;
			}else {
				high--;
			}
		}
		return result;
	}

}
