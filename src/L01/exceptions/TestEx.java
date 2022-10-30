package L01.exceptions;

public class TestEx {

	public static void main(String[] args) {
		Integer x[] = {1,2,3,0,8,null,4}; 
		for (int i = 0; i < x.length; i++) {
			try { 
				int y = 10 / x[i]; 
				System.out.println("y = "+y);
			}
			catch (ArithmeticException ae) {
				System.out.println(" Arithmetic Exception"); 
				ae.printStackTrace(); 
			} 
			catch (Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
			} 
			finally {
				System.out.println("finally");
			}
		} 
		System.out.println("finished");	
	}
}
