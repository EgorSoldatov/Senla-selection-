package eeeboy;

import java.util.*;

public class first {
	public static void main(String args[]) {
		int n;
		int k = 0;
		Scanner scn = new Scanner(System.in);	
		n = scn.nextInt();
		for (int i = 1; i < n; i = i + 1) 
		{
			for (int a = 1; a < i; a = a + 1) 
			{
				if (i % a == 0) 
				{
					k = k + 1;
				}
			}
			if (k == 1) {System.out.print(i);System.out.print(" ");}
			k = 0;
		}
	}
}
