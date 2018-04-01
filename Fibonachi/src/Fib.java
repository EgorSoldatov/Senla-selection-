import java.util.*;

public class Fib {
	
	public static int F(int N){
        if(N==0)return 0;
        if(N==1)return 1;
        return F(N-1)+F(N-2);
    }
 public static void main(String[]args){
     Scanner scn = new Scanner(System.in);
     int k = scn.nextInt();
     int h;
     for(int N=0;N<10;N++) 
     	{
    	 h = F(N);
    	 if (h < k) System.out.println(h);
     	}
         
    }

}
