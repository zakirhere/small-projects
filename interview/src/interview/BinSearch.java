package interview;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final int searchInput = 29;
		for(int i=0; i<getArrayValues().length; i++) {
			System.out.println(getArrayValues()[i]);
			if(getArrayValues()[i] == searchInput) {
				System.out.println(i);
				break;
			}
		}
		
	}

	public static int[] getArrayValues() {
		return new int[] {3,8,22,29,43,55,61,74,78,95,96};
	}
}
