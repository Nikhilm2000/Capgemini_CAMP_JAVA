package day4;

import java.io.IOException;
import java.util.*;
//Exception ,IOException -- Checked Exception
//RunTimeException--Unchecked Exception
 
class OddException extends RuntimeException {
	OddException(String message) {
		super(message);
	}
}

public class CustomException {
	public static void main(String[] args)  {
		//try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a % 2 == 0) {

				System.out.println(a + "is Even number");
			} else {
				throw new OddException("Enter even number only");
			}

		/*} catch (Exception e) {
			System.out.println("Exception-Invalid Number");
			e.printStackTrace();
		}*/
	}
}
