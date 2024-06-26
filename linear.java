package learn;
import java.util.*;
public class linear {
	public static void lin(int a[]) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.print(i);
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		lin(a);
	}

}
