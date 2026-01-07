import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ye he aapki screen par 7 crore ka sawal");
		int answer1;
		System.out.println();
        System.out.println("KYA AAPKE TOOTHPASTE ME NAMAK HE.....?(write answer number(like 1 or 2)");
        System.out.println("1.Yessss");
        System.out.println("2.Nahi.....");
        answer1 = sc.nextInt();	
        
        if(answer1==1)
        {
        	System.out.println("Ohhhh........");
        }
        else
        {
        	System.out.println("Ohhhh....use another toothpaste");
        }
        
	}

}
