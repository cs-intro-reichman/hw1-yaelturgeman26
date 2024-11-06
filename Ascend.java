// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		int smallest = Math.min(Math.min(b, c), a);
		int largest = Math.max(Math.max(b, c), a);
		int middle = Math.max(Math.min(b, c),Math.min(Math.max(b, c), a));
		System.out.println(a + " " + b + " " + c);
		System.out.println(smallest + " " + middle + " " + largest);
	}
}
