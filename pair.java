package learn;

public class pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.println("("+a[i]+ +a[j]+")");
			}
		}
	}

}
