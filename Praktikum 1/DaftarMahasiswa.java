import java.util.Scanner;

class DaftarMahasiswa
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String nama = input.next();
		String nim = input.next();
		int sks = input.nextInt();
		int skstambah = input.nextInt();
		Mahasiswa mahasiswa = new Mahasiswa(nama, nim, sks);


		System.out.println("Nama mahasiswa: " + nama);
		System.out.println("NIM mahasiswa: " + nim);
		System.out.println("SKS mahasiswa: " + sks);
		System.out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
		System.out.println("Total Revisi SKS mahasiswa: " + (sks + skstambah));
	}
}