import java.util.ArrayList;
import java.util.Scanner;

public class SpecialPythagoreantriplet {
	static int max(int i,int j){
		return (i>j)?i:j;
	}
	static Boolean checktrig(int i,int j,int k){
		if(2*max(max(i,j),k)*max(max(i,j),k)==i*i+j*j+k*k){
			return true;
		}else{
			return false;
		}
	}
	static int trig(int n){
		int index=-1;
		int index2=0;
		double p=0;
		for(int i=1;i<n/2+1;i++){
			for(int j=1;j<n-i;j++){
				if(checktrig(i,j,n-i-j)){
					index2=(int) (i*j*(n-i-j));
					if(index<index2){
						index=index2;
					}
				}
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		for (int j = 0; j < number; j++) {
			System.out.println(trig(sample[j]));
		}
	}
}
