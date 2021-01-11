/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while (t-- != 0) {
				int n = Integer.parseInt(br.readLine());
				String s = br.readLine();
				ArrayList<String> codes = new ArrayList<String>();
				for (int i = 0; i < s.length(); i += 4)
					codes.add(s.substring(i, i + 4));
				String decoded = "";
				for (int i = 0; i < codes.size(); i++) {
					char ch = decodeChar(codes.get(i));
					decoded += ch;
				}
				System.out.println(decoded);
			}

		} catch (Exception e) {
			return;
		}
	}

	static char decodeChar(String code) {
		int a = 97;
		int l = 0, r = 15, m = 8;
		for (int i = 0; i < 4; i++) {
			char ch = code.charAt(i);
			if (i == 3) {
				a = ch == '0' ? 97 + l : 97 + r;
			}
			if (ch == '0')
				r -= m;
			else
				l += m;
			m /= 2;
		}
		return (char) a;

	}
}


