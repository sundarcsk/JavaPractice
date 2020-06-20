package frstpkg;
/*
Given a sentence S of length M and keyword K of length L, write a program to print the encrypted sentence using the following procedure
1. Replace S[i] by the letter which is at Nth position to the right in cyclic alphabetical order. N is positional value of K[j] in 
   alphabetical order where j=i mod L
2. Retain all non alphabets of S[i] and do not consider them in the above procedure. Consider lower cases for both the values.

Sample Input:
S = "Journey"
K = "Team"       "team"   --> 19,4,0,12

S  =  j  o  u  r  n  e  y
ad = 19  4  0 12 19  4  0
o/p=  c  s  u  d  g  i  y

*/


import java.util.ArrayList;
import java.util.List;

public class SecretCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="C4arg6r";
		String secondInput="wire";
		inp=inp.toLowerCase();
		secondInput=secondInput.toLowerCase();
		List<Integer> intValue = new ArrayList<>();
		List<Integer> secValue = new ArrayList<>();
		for (int i=0; i< inp.length(); i++) {
			int val=(inp.charAt(i)-97);//getting the ASCII value for the characters 
			intValue.add(val);//storing the values in new Array list
			System.out.print(val + " ");
		}
		for (int i=0; i< secondInput.length(); i++) {
			int val=(secondInput.charAt(i)-97);
			secValue.add(val);		
		}
		System.out.println(secValue);
		String out="";
		for(int j=0;j<intValue.size();j++) {
			if(intValue.get(j)>=0) {
				int addedValue=((intValue.get(j)+secValue.get(j%secValue.size()))%26)+97;//to add the source value with the destination value and
				//taking modulus with 26 to find the alphabet in the cyclic order and add 97 to retain its original alphabet
//				intValue.set(j,addedValue);
				out+=(char)(addedValue);//add the values in an empty string 
			}
			else
			{
				int integ=intValue.get(j)+97;
//				intValue.set(j,integ);
				out+=(char)(integ);
			}
		}
		System.out.println(intValue);
		System.out.println(out);
	}
}
