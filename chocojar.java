package learn;
import java.util.*;
public class chocojar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0,d=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			if(b[i]%a==0) {
				c=c+(b[i]/a);
			}
			else {
				d=0;
				d=b[i]/a+1;
				c=c+d;
			}
		}
		System.out.println(c);

	}

}
