// Splits a restaurant bill evenly among three diners.
public class Bill3 {
		public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		int BillAmount = Integer.parseInt(args[3]);
		double total = Math.ceil((double) BillAmount / 3);
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + total + " Shekels each.");
	}
}
