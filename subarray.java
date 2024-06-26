package learn;
import java.util.*;
public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			for(int j=0;j<b;j++) {
				for(int k=i;k<j;k++) {
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
		
	}

}
