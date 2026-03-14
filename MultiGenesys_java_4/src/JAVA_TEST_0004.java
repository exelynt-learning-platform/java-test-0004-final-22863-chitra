/*
 Write a Java program to print the following pattern:

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/
public class JAVA_TEST_0004 {
	 public static void main(String[] args) {
	        printConcentricSquare(4);
	    }

	    public static void printConcentricSquare(int n) {
	        int size = 2 * n - 1;
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {

	            	int top = i;
	                int left = j;
	                int bottom = size - 1 - i;
	                int right = size - 1 - j;
	                
	                int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));
	                
	                sb.append(value).append(" ");
	            }
	            sb.append("\n");
	        }

	        System.out.print(sb.toString());
	    }
}
