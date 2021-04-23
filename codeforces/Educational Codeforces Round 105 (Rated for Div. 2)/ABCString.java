package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ABCString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String a = br.readLine();
			int cA = 0, cB = 0, cC = 0;
			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);
				if (ch == 'A')
					cA++;
				else if (ch == 'B')
					cB++;
				else
					cC++;
			}
			char ch = a.charAt(0);
			int oc = 0, moc1 = 0, moc2 = 0;
			char ocp = ' ', mocp1 = ' ', mocp2 = ' ';
			if (ch == 'A') {
				oc = cA;
				moc1 = cB;
				moc2 = cC;
				ocp = 'A';
				mocp1 = 'B';
				mocp2 = 'C';
			} else if (ch == 'B') {
				oc = cB;
				moc1 = cA;
				moc2 = cC;
				ocp = 'B';
				mocp1 = 'A';
				mocp2 = 'C';
			} else {
				oc = cC;
				moc1 = cA;
				moc2 = cB;
				ocp = 'C';
				mocp1 = 'A';
				mocp2 = 'B';
			}
			if (oc == moc1 + moc2) {
				a = a.replace(ocp, '(');
				a = a.replace(mocp1, ')');
				a = a.replace(mocp2, ')');
				System.out.println(valid_paren(a));
			} else if (oc + moc1 == moc2) {
				a = a.replace(ocp, '(');
				a = a.replace(mocp1, '(');
				a = a.replace(mocp2, ')');
				System.out.println(valid_paren(a));
			} else if (oc + moc2 == moc1) {
				a = a.replace(ocp, '(');
				a = a.replace(mocp1, ')');
				a = a.replace(mocp2, '(');
				System.out.println(valid_paren(a));
			} else
				System.out.println("NO");
		}
		br.close();
	}

	public static String valid_paren(String input_str) {
		Stack<Character> s = new Stack<Character>();
		for (char st : input_str.toCharArray()) {
			if (st == '(') {
				s.push(st);
			} else {
				if (s.empty())
					return "NO";
				else {
					char top = (Character) s.peek();
					if (st == ')' && top == '(')
						s.pop();
					else
						return "NO";
				}
			}
		}
		if (s.empty())
			return "YES";
		else
			return "No";

	}
}

