import java.util.Scanner;

class Main {

	public static final String PULS = "+";
	public static final String MINUS = "-";

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] strList = str.split("");
		int num = 0;
		for (String a : strList) {
			if (a.equals(PULS)) {
				num++;
			}
			if (a.equals(MINUS)) {
				num--;
			}
		}
		System.out.println(num);
		scan.close();
	}
}