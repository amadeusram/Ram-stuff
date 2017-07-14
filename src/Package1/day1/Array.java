package Package1.day1;

public class Array {
	public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	
	// for each
	
	for( int tem : a) {
		System.out.println(tem);
	}
	
	int[] x = new int[5]; x[4]=12332;
 	System.out.println("x=" + x);
 	
 	for (int tem : x) { System.out.println(tem); }
 	
 	System.out.println(".................");
 	String jj = "mazaaa" ; 
	String[] s = new String[10];  
	System.out.println(" JJ =" + jj);
	for (String tem : s ) { System.out.println(tem); }
}
}
