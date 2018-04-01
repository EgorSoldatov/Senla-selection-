import java.util.Scanner;
public class Palindrrrom {


public static Boolean isPalindrome(String s) {
    for (int i = 0; i < s.length() / 2; ++i) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false; 
        }
    }
    return true;
}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		boolean c;		
		String str;
		str = scn.nextLine();
		c = isPalindrome(str);
		if (c) 
			System.out.print("Палиндром");
		else
			System.out.print("Не палиндром");
	}
	
}
