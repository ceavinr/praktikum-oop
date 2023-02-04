public class Nasabah {
  private String nama;
  private int tahunLahir;
  private String kota;
  private String pin;

  public Nasabah (String nama, int tahunLahir, String kota, String pin){
  	this.nama=nama;
  	this.tahunLahir=tahunLahir;
  	this.kota=kota;
  	this.pin=pin;
  }

  // Mendapatkan umur dari nasabah
  public int getUmur(){
  	return 2020-this.tahunLahir;
  }

  // Menuliskan informasi nasabah
  public void printInfo(){
  	System.out.println("Nama: " + this.nama);
  	System.out.println("Kota: " + this.kota);
	  System.out.println("Umur: " + getUmur() + " tahun");
  }

  // Membandingkan nilai pin masukan dengan nilai pin nasabah
  public boolean isPinMatch(String pin){
   return this.pin.equals(pin);
  }
}