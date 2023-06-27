package day03;

public class Program03 {

	public static void main(String[] args) {
		Program03 x= new Program03();
		x.subfunction(20,10);
		x.subfunction(100,50);
	}
	public void subfunction(int a, int b)
	{
		System.out.println(a-b);
	}

}
