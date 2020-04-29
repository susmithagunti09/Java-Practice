import java.util.*;
public class Maxsumarray {
	public static void main(String[] args) 
    { 
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
    int n = a.length;    
    int max_sum = maxSubArraySum(a, n); 
    int max=maxarray(a,n);
    System.out.println("Maximum contiguous sum is " 
                       + max_sum); 
    
    } 
	static int maxarray(int[] a, int size)
	{
		 
	    int max_so_far = a[0]; 
	    int curr_max = a[0]; 
	  
	    for (int i = 1; i < size; i++) 
	    { 
	           curr_max = Math.max(a[i], curr_max+a[i]); 
	        max_so_far = Math.max(max_so_far, curr_max); 
	    } 
	    return max_so_far; 
	    
	}
	static int maxSubArraySum(int[] a,int size)
	{
		int maxsum=a[0]; 
		int currsum=a[0];
		int startcurr=0;
		int endcurr=0;
		int startmax=0,endmax=0;
		for (int i = 1; i < size; i++) 
	    { 
			if (currsum + a[i] >= a[i]) {
				endcurr = i;
				currsum = currsum + a[i];
			} else {
				startcurr = i;
				endcurr = i;
				currsum = a[i];
			}

			if (currsum > maxsum) {
				startmax = startcurr;
				endmax = endcurr;
				maxsum = currsum;
			}
	    } 
		System.out.println(startmax);
		System.out.println(endmax);
		System.out.println(maxsum);
		return maxsum;
	}
} 


