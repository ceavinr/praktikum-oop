import java.util.Scanner;  // Import the Scanner class

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);  // Create a Scanner object

	    int p1x = input.nextInt(); // Read user int input
	    int p1y = input.nextInt();
	    int p2x = input.nextInt();
	    int p2y = input.nextInt();
	    int p3x = input.nextInt();
	    int p3y = input.nextInt();

		Bird b=new Bird(p1x,p1y);
		Fish f=new Fish(p2x,p2y);
		Monkey m=new Monkey(p3x,p3y);

		int nb = input.nextInt();
		for (int i=0;i<nb;i++){
			b.makeSound();
		}

		int nm = input.nextInt();
		for (int i=0;i<nm;i++){
			m.makeSound();
		}

		int nf = input.nextInt();
		for (int i=0;i<nf;i++){
			f.makeSound();
		}

		f.print();
		m.print();
		b.print();
	}
}