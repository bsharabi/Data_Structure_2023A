package L01.exceptions;

import java.util.StringTokenizer;

public class TesrStringTokenizer {
	public static void main(String[] args) {
		String s = "to be,or not - to be?";
		StringTokenizer st = new StringTokenizer(s,",?-");
		int numTok = st.countTokens();
		System.out.println("num tocens = "+numTok);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
