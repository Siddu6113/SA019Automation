

//B NullPointException


package JavaAssignments;

public class NullPointerExceptionExample {
public static void main(String[] args) {
	try {
		String str = null;
		int length = str.length();
		System.out.println("Length of the string;" + length);
	} catch (NullPointerException e) {
		System.out.println("NullPointerException occured;" + e.getMessage());
	}
}
}
