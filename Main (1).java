
public class Main
{
	public static void main(String[] args) {
		int a[][]={{1,2,3,4,5},{6,7,8,9,10}};
		int b[][]=a.clone();
		a[0][0]=100;
		
		System.out.println(b[0][0]);
}
}
