import java.util.Scanner;

public class combinationfactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Defining variables
		int num1, num2 ;
		System.out.print("Enter the number of elements in the set: ");
		num1=input.nextInt();
		System.out.print("Enter the number of elements in the subset: ");
		num2=input.nextInt();
		
		
		
		//defining factorials
		int k=1 ;
		int j=1;
		int i=1;
		int sf1=1;
		int sf2=1 ;
		int df=1;
		
		//calculating the factorial of the all set
		do {
			sf1 *= i;
			i++;
		}
		while(i<=num1); 
			
		//System.out.println(sf1);
		
		
		//calculating the factorial of the subset set
		do {
			sf2 *= k;
			k++;
		}
		while(k<=num2); 
			
		//System.out.println(sf2);
		
		
		//calculating the factorial of the difference
		do {
			df *= j;
			j++;
		}
		while(j<=num1-num2); 
			
		//System.out.print(df);
		
		//calculating the combination formula and printing the results
		double comb = sf1 /(sf2*df);
		System.out.println("C("+num1+","+num2+") is " + comb);
		
	}

}
