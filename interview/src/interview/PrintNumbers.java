package interview;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers chkDiv = new PrintNumbers();
		
        for(int i=0; i<=100; i++) {
            if(chkDiv.isDivisibleBy3(i) && chkDiv.isDivisibleBy7(i)) {
                System.out.println("foobar");
            }
            else if(chkDiv.isDivisibleBy3(i)) {
                System.out.println("foo");
            }
            else if(chkDiv.isDivisibleBy7(i)) {
                System.out.println("bar");
            }
        }
	}

	public boolean isDivisibleBy3(int num) {
	    return num%3 == 0;
	}
	
	
	public boolean isDivisibleBy7(int num) {
	        return num%7 == 0;
	}
}
