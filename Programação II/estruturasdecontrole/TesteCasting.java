package estruturasdecontrole;

public class TesteCasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double d = 10.5;
		int i = (int) d; //type casting explícito
		double d1 = i;
		
		System.out.println(d);
		System.out.println(i);
		
		long m = 1000000;
		System.out.println(m);
		
		long n = 1000000000000000L;
		System.out.println(n);
	}

}
