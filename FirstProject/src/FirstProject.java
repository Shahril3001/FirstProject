public class FirstProject {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		
		final int n = 20;          // To compute factorial of n
	    int factorial = 1;   // the product to 1
	 
	      int i = 1;
	      while (i <= n) {
	         factorial = factorial * i;
	         i++;
	      }
	      System.out.println("The Factorial of " + n + " is " + factorial);
	      
	      int e = 10;
	      int newnum = 10 + e++;
	      System.out.println("The Factorial of " + newnum);
	      
	      int f = 10;
	      int newnum1 = 10 + ++f;
	      System.out.println("The Factorial of " + newnum1);
		}
}
