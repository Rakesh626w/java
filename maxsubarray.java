package learn;
import java.util.*;
public class maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,-2,6,-1,3};
		Scanner sc=new Scanner(System.in);
		int c=0;
		int ms=0;
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			c=c+a[i];
			if(c<0) {
				c=0;
			}
			ms=Math.max(ms,c);
		}
		System.out.println(ms);
	}

}
