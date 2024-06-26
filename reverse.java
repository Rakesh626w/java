package learn;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++) {
			a[i]=sc.nextInt();
		}
		int st=0;
		int end=a.length-1;
		while(st<end) {
			int temp=a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
		for(int i=0;i<b;i++) {
			System.out.print(a[i]);
		}
	}

}
