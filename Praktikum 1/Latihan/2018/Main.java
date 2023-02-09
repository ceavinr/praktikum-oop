import java.util.Scanner;  // Import the Scanner class

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String nama = input.next();
		int tahunLahir = input.nextInt();
		String kota = input.next();
		String pin = input.next();
		int saldoA = input.nextInt();
		int saldoB = input.nextInt();

		Nasabah An = new Nasabah(nama,tahunLahir,kota,pin);
		Nasabah Bn = new Nasabah(nama,tahunLahir,kota,pin);

		Rekening A = new Rekening(An, saldoA);
		Rekening B = new Rekening(Bn, saldoB);

		A.printInfo();
		B.printInfo();
		
		int transfer = input.nextInt();
		String pinA = input.next();
		A.transfer(B, transfer, pinA);

		int tarik = input.nextInt();
		String pinB = input.next();
		B.withdraw(tarik,pinB);

		A.printInfo();
		B.printInfo();
	}
}