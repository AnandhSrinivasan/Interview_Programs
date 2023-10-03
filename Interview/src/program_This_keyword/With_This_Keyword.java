package program_This_keyword;



	class student{
		int Rollno;
		String name ;
		float marks ;
		 student(int Rollno, String name, float marks){
			this.Rollno = Rollno;
			this.name = name;
			this.marks = marks;
		}
		 void display() {
			 System.out.println(Rollno + " " + name + " " + marks);
		 }
	}
	public class With_This_Keyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stud = new student(4024, "Anandh", (float) 80.10);
		stud.display();
	}

}
