import java.util.Scanner;


public class Largestproductinaseries {
	static long largestproduct(String number, int length,int no ){

		int[] digits=new int[length];
		for(int i=0;i<=length-1;i++){
			digits[i]= (number.charAt(i) - '0');
		}
		long product=0;
		int q=no-1;
		for(int p=0;q<length-1;p++,q++ ){
			long product2=1;
			for(int m=p;m<=q;m++){
				product2=product2*digits[m];
			}
			if(product2>product){
				product=product2;
			}
		}
		return product;
	}
	
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
			int number = Integer.parseInt(in.nextLine().trim());
			long[][] sample = new long[number][2];
			String[] series = new String[number];
			for (int j = 0; j < number; j++) {
				String[] split = in.nextLine().split("\\s");
				sample[j][0] = Long.parseLong(split[0]);
				sample[j][1] = Long.parseLong(split[1]);
				series[j] = in.nextLine().trim();
			}
		for(int j=0;j<number;j++){
			System.out.println(largestproduct(series[j], (int) sample[j][0],(int) sample[j][1] ));
		}
	}
}
