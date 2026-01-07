import java.util.Scanner;

public class Quiz2 
{
	
//     public static void  answer(int a)
//     {
//    	 if(a==1) 
//    	    {
//    		 System.out.println("wrong answer");
//    	    }
//    	 
//    	 else 
//    		 {
//    		 System.out.println("right");
//    		 
//    		 }
//     }
    
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("QUETIONS");System.out.println();
		
		System.out.println("C++ is a insensitive language");
		System.out.println("1.True \n2.False\n(write t or f)");
		int a = sc.nextInt();
		//answer(a);
		if(a==1) 
	    {
		 System.out.println("wrong answer");
	    }
	 
	 else 
		 {
		 System.out.println("right");
		 
		 }
		
		System.out.println("The return statement in c++ function is mendetary");
		System.out.println("1.True \n2.False\n(write 1 or 2)");
	    a = sc.nextInt();
		//answer(a);
	    
	    if(a==1) 
	    {
		 System.out.println("wrong answer");
	    }
	 
	 else 
		 {
		 System.out.println("right");
		 
		 }

	}

}
