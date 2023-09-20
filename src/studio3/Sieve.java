package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many primes should i find before the value n :");
		int n = in.nextInt();
		boolean A[];
		int i;
		int j;
		int primecount =0;
		A = new boolean[((n+1))];
		for(i=0; i < A.length; i++) {
			A[i]= true;
		}
		for (i=2; i<=Math.sqrt(n); i++) {
		//System.out.println(A[i]);
			if(A[i]) {
				for(j = (int) Math.pow(i, 2);j<=n; j = j+i) {
					A[j] = false;
				}
			}
	}
		for(i = 1; i < A.length; i++) {
			if(A[i]) {
				primecount ++;
				System.out.println(i);
			}
		}
System.out.println(primecount);
}
}