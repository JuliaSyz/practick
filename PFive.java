class Sum{
     public int rec(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + rec(n / 10);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Sum s=new Sum();
		System.out.println(s.rec(11211));
	}
}
