import java.util.*;

public class Stroka {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); 
        System.out.print("string? "); 
        String s = in.nextLine(), r = ""; 
        for (int i = 0; i < s.length(); ++i) { 
            char c = s.charAt(i); 
            if (!Character.isDigit(c)) r += c;    
        } 
        System.out.println("result: " + r); 
	
}
}
