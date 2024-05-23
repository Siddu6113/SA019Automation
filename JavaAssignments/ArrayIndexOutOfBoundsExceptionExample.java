
//3.Write a Java Program to handle given uncheck exception
//A.ArrayIndexOutOfBound



package JavaAssignments;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3};
			int index =5;
			int value = arr[index];
			System.out.println("Value at index "+ index +":" + value);
		}	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured;" +e.getMessage ());
			
		}
	}

	}


