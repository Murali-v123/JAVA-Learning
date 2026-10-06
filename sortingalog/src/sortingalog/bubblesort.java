package sortingalog;

import java.util.Arrays;

public class bubblesort {
	public static void main(String args[]) {
		int[] nums= {9,7,4,4,5,6,3,8};
		
		System.out.println("Elements before bubble sorting:\n"+Arrays.toString(nums));
		System.out.println("Elements before selection sorting:\n"+Arrays.toString(nums));
		bubblesort1(nums);
		Selectionsort1(nums);
		
		
		
	}


public static void bubblesort1(int[] nums) {
	int temp;
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums.length-i-1;j++) {
			if(nums[j]>nums[j+1]) {
				temp=nums[j+1];
				nums[j+1]=nums[j];
				nums[j]=temp;
				}
			}
		}
	System.out.println("Elements After bubble sorting:\n"+Arrays.toString(nums));
	}


public static void Selectionsort1(int[] nums) {
	int temp;
	int minindex=-1;
	for(int i=0;i<nums.length-1;i++) {
		minindex=i;
		for(int j=i;j<nums.length;j++) {
			if(nums[minindex]>nums[j]) {
				minindex=j;
				}
			}
		temp=nums[minindex];
		nums[minindex]=nums[i];
		nums[i]=temp;
		}
	System.out.println("Elements After selection sorting:\n"+Arrays.toString(nums));
	}
}

