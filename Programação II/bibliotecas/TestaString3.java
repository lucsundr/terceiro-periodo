package bibliotecas;

public class TestaString3 {
	public static void main(String[] args) {
		String a = "Venha aprender Java no Senac";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[4]);
		
		String c = "       venha aprender java no senac";
		System.out.println(c);
		int i = a.compareTo(a);
		System.out.println(i);
		int j = c.compareTo(a);
		System.out.println(j);
		int k = c.compareToIgnoreCase(a);
		System.out.println(k);
		
		char dc = a.charAt(3); //zero based
		System.out.println(dc);
		int m = a.length(); //nzero based
		System.out.println(m);
		String n = c.substring(15); //zero based
		System.out.println(n);
		String p = c.trim();
		System.out.println(p);
		int q = c.indexOf("a");
		System.out.println(q);
		int r = c.lastIndexOf("a");
		System.out.println(r);
		
		boolean s = a.isEmpty();
		System.out.println(s);
		String t = " ";
		System.out.println(t.isEmpty()); //espaço conta!
		String u = "";
		System.out.println(u.isEmpty());
		
		boolean v = a.contains("Java");
		System.out.println(v);
		boolean x = a.contains("java");
		System.out.println(x);
		
		String z = a.replace("a", "o");
		System.out.println(z);
				
	}

}
