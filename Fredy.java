import java.util.*;

class Fredy{
	static double time=0;
	static int hop=0;
	
	static void startJump(int distance)
	{
		if(distance>=5)
			jump5m(distance);
		else if(distance>=3)
			jump3m(distance);
		else if(distance>=1)
			jump1m(distance);
		else if(distance==0)
			System.out.println("No Distance to jump");
			
	}
	static void jump5m(int distance)
	{
		if(distance>5){
			distance=distance-5;
			hop++;
			time =time+1;
			
			jump3m(distance);
		}
		else
		{
			distance=distance-5;
			hop++;
			
		}
		
		
	}
	static void jump3m(int distance)
	{
		if(distance>3){
			distance=distance-3;
			hop++;
			time =time+2;
			
			jump1m(distance);
		}
		else{
			distance=distance-3;
			hop++;
		}
		
		
	}
	static void jump1m(int distance)
	{
		if(distance>1){
			distance=distance-1;
			hop++;
			time =time+3.5;
			startJump(distance);
		}
		else{
			distance=distance-1;
			hop++;
		}
		
		
	}
	public static void main(String[] args)
	{
		int distance;
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Distance : ");
		distance=sc.nextInt();
		startJump(distance);
		System.out.println("Hops = "+hop);
		System.out.println("Time = "+time);
		
	}
}
