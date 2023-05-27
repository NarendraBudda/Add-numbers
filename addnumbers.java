import java.util.Scanner;
class addnumbers{
	public static void main(String[] input){
		int num1;
		int num2;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter range starting number");
		num1 = sc.nextInt();
		System.out.println("enter range end number ");
		num2 = sc.nextInt();
		for(num1=num1;num1<=num2;num1++){
			sum=sum+num1;
		}
		System.out.println("sum of numbers between in the range "+sum);
	}
}