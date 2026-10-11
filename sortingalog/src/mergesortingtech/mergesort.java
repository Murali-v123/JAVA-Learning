package mergesortingtech;

import java.util.ArrayList;

public class mergesort {
	
	public static void mergesort(int nums[],int low,int high) {
		if(low>=high) return;
		int mid=(low+high)/2;
		mergesort(nums, low, mid);
		mergesort(nums, mid+1, high);
		merge(nums,low,mid,high);
	}
	
	
	private static void merge(int[] nums, int low, int mid, int high) {
		int left=low;
		int right=mid+1;
//		int k=0;
//		int[] arr=new int[high-low+1];
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(left<=mid && right<=high){
			if(nums[left]<nums[right]) {
//				arr[k]=nums[left];
				list.add(nums[left]);
				left++;
			}
			else {
//				arr[k]=nums[right];
				list.add(nums[right]);
				right++;
			}
//			k++;
		}
		while(left<=mid) {
//			arr[k]=nums[left];
			list.add(nums[left]);
//			k++;
			left++;
		}
		while(right<=high) {
//			arr[k]=nums[right];
			list.add(nums[right]);
			right++;
//			k++;
		}
		
		for(int i=0;i<list.size();i++) {
//			nums[low+i]=arr[i];
			nums[low+i]=list.get(i);
		}
		
	}


	public static void main(String args[]) {
		int[] arr= {15,21,03,74,58,236,86,3245,1,3,65,0};
		System.out.println("Elements before sort:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		mergesort(arr,0,arr.length-1);
		
		System.out.println("Elements after sort:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
