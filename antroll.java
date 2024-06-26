package learn;
import java.util.*;
public class antroll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=0,c=0;
		int a=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			 b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			d=d+b[i];
			if (d==0) {
				c+=1;
			}
		}
		System.out.println(c);
}
}
