package bibliotecas;

public class TesteString3 {
	public static void main(String[] args) {
		String a = new String("Venha aprender Java no Senac");
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[4]);
		
		String c ="Venha aprender java no senac";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = c.compareToIgnoreCase(a);
		System.out.println(k);
		
		char dc = a.charAt(3); //zero based
		System.out.println(dc);
		int m = a.length(); //nzero based
		System.out.println(m);
		String n = c.substring(15);
		System.out.println(n);
		String p = c.trim();
		System.out.println(p);
		int q = c.indexOf("a");
		System.out.println(q);
		int r = c.lastIndexOf("a");
		System.out.println(r);
		
		boolean s = a.isEmpty();
		System.out.println(s);
		String t = "";
		System.out.println(t.isEmpty());
	}

}
