class Test{
	
	static int l;
	
	Test(){System.out.println("This is Constructor");}
		
	static{
		l=15;
		System.out.println("This is Static block. i = "+l);
	}

	{
		int m=10;
		int n=20;
		int total=m+n+l;
		System.out.println("This is Enpty Block. Total = "+total);
	}
	
	
	public static void main(String[] args)
	{
		Test test1 = new Test();
		System.out.println("------------------------------");
		Test test2 = new Test();
	}
	
	
}

/*
D:\LP training\New folder>javac Test.java

D:\LP training\New folder>java Test
This is Static block. i = 15
This is Enpty Block. Total = 45
This is Constructor
------------------------------
This is Enpty Block. Total = 45
This is Constructor
*/



