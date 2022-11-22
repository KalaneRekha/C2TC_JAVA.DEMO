package ExceptionEX;


	public class ThrowsEx {
		void m1() throws ArithmeticException
		{
			System.out.println("Method1 is created ");
		}
		void m2() {
			System.out.println("Method2 is created");
		}
		void m3() {
			System.out.println("Method3 is created");
		}
		public static void main(String[]args) {
			ThrowsEx t=new ThrowsEx();
			t.m1();
			t.m2();
			t.m3();
		}
	}

