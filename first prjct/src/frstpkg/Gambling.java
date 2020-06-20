package frstpkg;
/*
 Given a list of integers, find the perfect square values present in the list and corresponding root values of them.
 find the factorial of the individual values from the list.
 print the last 3 digit non zero values of the factorial value in ascending order with a space in between them
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gambling {

	public static void main(String[] args) {
		int[] intarr= {2,3,5,6,7,8};
		Arrays.sort(intarr);
		List<Integer> list = new ArrayList<>(intarr.length);
		List<Integer> fline = new ArrayList<>();
		List<Integer> secline = new ArrayList<>();
		for( int i:intarr) {
			list.add(Integer.valueOf(i));
		}
		System.out.println(list);
		//to find the perfect square from the numbers present in the list
		for(int i=2;i<=intarr[intarr.length-1];i++) {
			for (int j: intarr) {
				if(i*i==j) {
					//adding the square root value in a new list fline.
					fline.add(i);
					System.out.print(i);
					System.out.print(" ");
					break;
				}
			}
		}
		
		for(int a:fline) {
			// finding factorial for the numbers present in the list
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact=fact*i;
			}
			//neglecting the last zeroes from the factorial value
			while(fact%10==0) {
				fact=fact/10;						
			}
			//adding the last 3 digit value of the factorial values.
			fact=fact%1000;
			secline.add(fact);	
		}
		Collections.sort(secline);
		if(secline.isEmpty()) {
			System.out.println(-1);
		}
		System.out.println();
		for (int i:secline) {
			System.out.print(i);
			System.out.print(" ");
		}	
	}
}
