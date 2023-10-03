package program_SwapNums;

public class Swap_Two_Nums_AnotherMethd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenum = 15;
		int revnum = 0;
		while (givenum!=0) {
			revnum = revnum*10;                        // 0*10 =0                           // 5*10=50
			revnum = revnum+givenum%10;                // 0+15%10= Quotient value 15%10=5  // 50+1%10= 1
  			givenum =givenum/10;                       // 15/10 = 1                         // 1/10=0
		}System.out.println(revnum);
	}

}
