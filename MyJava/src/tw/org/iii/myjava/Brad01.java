package tw.org.iii.myjava;

public class Brad01 {
	public static void main(String[] args) {
		// Data Type
		// Integer: byte(2^8) short(2^16) int(2^32) long(2^64)
		// 1. [a-zA-Z$_][a-zA-Z0-9$_]*
		// 2. no keyword
		byte var1,var2,var3=123,var4;	// -128 ~ 127
		var1 = -128; var1--; var2 = 1;
		System.out.println(var2);
		
		short var5 = -32768;
		System.out.println(var5);
		
		long var6 = 1234L;
		System.out.println(var6);
		
		// Float :float, double
		//Float
		float var7 = 12.3F;
		double var8 = 12.3;
		float var9 = 123;
		
		// char: 2^16 0 ~ 65525
		char var10 = 'a';
		char var11 = 65;	// ASCII => 'A'
		System.out.println(var11);
		
		char var12 = '資';
		char var13 = '\u0062';
		System.out.println(var13);
		
		int var14 = 0X12;
		System.out.println(var14);
		
		double var15 = 1.2e-4;	// 1.2 x 10 ^ 4
		System.out.println(var15);
		
		boolean var16 = true;
		boolean var17 = false;
		
		
		
		
	}
}
