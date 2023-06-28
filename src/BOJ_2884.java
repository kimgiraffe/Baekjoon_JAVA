import java.util.Scanner;

public class BOJ_2884 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int tmp = h * 60 + m;
		
		if(tmp - 45 < 0) {
			tmp += 24 * 60;
		}
		
		tmp -= 45;
		
		System.out.print(tmp / 60);
		System.out.print(" ");
		System.out.println( tmp % 60);
		sc.close();

	}
}