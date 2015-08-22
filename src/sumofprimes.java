import java.util.ArrayList;
import java.util.Scanner;

public class sumofprimes {
	static long sumofprimelistsmallerthann(long cases) {
		if(cases==2){
			return 2l;
		}else{
			if(cases==3){
				return 5l;
			}else{
				ArrayList<Long> series = new ArrayList<Long>();
				series.add(2l);
				long base = 3l;
				long sum=2l;
				while (base<=cases) {
					boolean isprime = true;
					for (Long prime : series) {
						if (prime > base) {
							break;
						} else {
							if (base % prime == 0) {
								isprime = false;
								break;
							}
						}
					}
					if (isprime) {
						series.add(base);
						sum+=base;
					}
					base += 2;
				}
				return sum;
				
			}
		}
	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long[] cases = new long[t];
		for (int i = 0; i < t; i++) {
			cases[i] = in.nextInt();
		}
		for (int i = 0; i < t; i++) {
			System.out.println(sumofprimelistsmallerthann(cases[i]));
		}
		in.close();
	}
}
