	import java.util.Scanner;

public class NN {

		public static int gcd(int h, int c)
		{ 
			int mod;
			mod = h % c;
			if (mod == 0) 
			{
				return c;
			}
			else 
			{
				return (gcd(c, mod));
			}	
	    }
		
		public static int lcm(int h, int c)
		{ 
			return h*c/gcd(h,c);	
	    }
		
	 public static void main(String[]args){
	     Scanner scn = new Scanner(System.in);
	     int a = scn.nextInt();
	     int b = scn.nextInt();
	     int k = gcd (a,b);
	     int l = lcm (a, b);
	     
	     System.out.println("NOD = "+k);
	     System.out.println("NOK = "+l);
	    }
	 
}
