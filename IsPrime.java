package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		boolean isPrime=false;
		
		for(int i=2;i<=num/2;i++)
		{			
			if(num%i==0)
			{
				isPrime=true;
				break;
			}
		}
		if(!isPrime)
		{
			System.out.println(num + " is a Prime Number");
		}
		else
		{
			System.out.println(num + " is not a Prime Number");
		}

}

}	