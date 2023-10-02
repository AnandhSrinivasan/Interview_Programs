package program_StringReverse;

public class String_Reverse_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anandh";
		char[] Rev = name.toCharArray();
		String Result ="";
		
		for (int i = Rev.length-1; i >=0; i--) {
			Result= Result+Rev[i];
		}System.out.println(Result);
	}

}
