package program_SwapNums;

public class Swap_Two_Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mysalary = 25000;
		int incrSalary = 50000;
		System.out.println("Before My Salary is :" + Mysalary );
		
		int temp = Mysalary;
		Mysalary=incrSalary;
		incrSalary= temp;
		System.out.println("------------");
		System.out.println("After Swap My Salary is :" + Mysalary );
	}

}
