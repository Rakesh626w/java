package learn;
import java.util.*;
public class bineary {
	public static void bi(int a[]) {
		int start=0;
		int end=a.length;
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==k) {
				System.out.println(mid);
				break;
			}
			else if(a[mid]>k) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {1,2,3,4,5,6};
			System.out.println(a.length);
			bi(a);
	}

}
