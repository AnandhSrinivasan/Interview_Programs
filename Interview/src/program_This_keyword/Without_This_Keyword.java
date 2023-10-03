package program_This_keyword;

class younger{
	int Rollno;
	String name;
	int marks ;
	public younger(int r, String n, int m) {
		// TODO Auto-generated constructor stub
		Rollno = r;
		name = n;
		marks = m;
	}
	void display() {
		System.out.println(Rollno + " " + name + " " + marks);
	}
}
public class Without_This_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		younger studs = new younger(4024, "Anandh", 100);
		studs.display();
	}

}
