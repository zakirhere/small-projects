package interview;

import java.util.ArrayList;
import java.util.Iterator;

public class BonusIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Iterator<String> combine(Iterator<String> iter1, Iterator<String> iter2) {
		ArrayList list = new ArrayList();
		
		while(iter1.hasNext() && iter2.hasNext()) {
			list.add(iter1.toString());
			list.add(iter2.toString());			
		}
		Iterator<String> listIterator = list.iterator();

		return listIterator;		
	}
}
