import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TesterMain
{
	public static void main(String args[])
	{
		System.out.println("Enter String to check the first non-repeated character : ");
		Scanner scanner = new Scanner(System.in);
		String stringCheck = scanner.nextLine();
		scanner.close();

		System.out.println("String Entered is : " + stringCheck);

		LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < stringCheck.length(); index++) {
			if (!countMap.containsKey(stringCheck.charAt(index))) {
				countMap.put(stringCheck.charAt(index), 1);
			} else {
				countMap.put(stringCheck.charAt(index), countMap.get(stringCheck.charAt(index)) + 1);
			}
		}

		for (Map.Entry<Character, Integer> element : countMap.entrySet()) {
			if (element.getValue() == 1) {
				if (!(element.getKey() == ' ')) {
					System.out.println("Found first non repeated character : " + element.getKey());
				}
				break;
			}
		}
	}
}