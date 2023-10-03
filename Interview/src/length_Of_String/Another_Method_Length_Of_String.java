package length_Of_String;

public class Another_Method_Length_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Chennai";
		char[] ops = value.toCharArray();
		int length=0;
		for (char c : ops) {
			length++;
		}System.out.println(length);
	}
}
