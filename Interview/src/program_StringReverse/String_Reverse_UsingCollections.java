package program_StringReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class String_Reverse_UsingCollections {
	public void Usingown() {
		String names = "Anandh";
		char[] chars = names.toCharArray();	
		
		List<Character> list = new ArrayList<Character>();
	for (Character character : chars) {
		list.add(character);
	}
	Collections.reverse(list);
	ListIterator iterator = list.listIterator();
	while (iterator.hasNext()) {
		System.out.print(iterator.next());
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Reverse_UsingCollections str = new String_Reverse_UsingCollections();
		str.Usingown();

	}

}
