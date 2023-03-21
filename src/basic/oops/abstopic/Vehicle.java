package basic.oops.abstopic;

public interface Vehicle 
{
//			1) constant Variables[public static final]
		int NO1 = 10;// public static final
//			2) abstract method--[public abstract]
		public void test1();// abstract
		public abstract void getSpec() ;
//			3) Non Abstract methods
//					---> static method----8
		public static void 	test2() 
		{
			System.out.println("Vehicle -- test2()");
		}
//					---> default method----8
		public default void test3() 
		{
			System.out.println("Vehicle -- test3()");
			test4();
		}
//					---> private method----9
		private void test4() 
		{
			System.out.println("Vehicle -- test4()");
		}
	
	
}
