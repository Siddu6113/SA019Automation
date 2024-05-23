
//1)Write A java program to reverse a string with and without reverse() function

//Without reverse()



package JavaAssignments;
import java.util.*;
public class StringReverseWithoutMethod {

	public static void main(String[] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println ("My name is siddu");
		String s1 =SC.next();
		String reverse="";
		for (int i = s1.length()-1;i>=0;i--)
			reverse = reverse+s1.charAt(i);
		System.out.println("The reverse String is " + reverse);
	}

}
