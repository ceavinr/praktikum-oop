public class Rekening {
  private static int jumlahRekeningTerdaftar=1;
  private int nomorRekening;
  private int saldo;
  private Nasabah nasabah;


  public Rekening(Nasabah nasabah, int saldo){
    this.nomorRekening=jumlahRekeningTerdaftar;
    this.jumlahRekeningTerdaftar++;
    this.nasabah=nasabah;
    this.saldo=saldo;
  }
  
  public void transfer(Rekening rekening, int jumlah, String pin){
    if(nasabah.isPinMatch(pin)){
      if(jumlah<this.saldo){
        this.saldo-=jumlah;
        rekening.saldo+=jumlah;
        System.out.println("Operasi sukses");
      } else{
        System.out.println("Saldo tidak mencukupi");
        System.out.println("Operasi gagal");
      }
    } else{
      System.out.println("Pin salah");
      System.out.println("Operasi gagal");
    }
  }

  public void withdraw(int jumlah, String pin){
    if(nasabah.isPinMatch(pin)){
      if(jumlah<this.saldo){
        this.saldo-=jumlah;
        System.out.println("Operasi sukses");
      } else{
        System.out.println("Saldo tidak mencukupi");
        System.out.println("Operasi gagal");
      }
    } else{
      System.out.println("Pin salah");
      System.out.println("Operasi gagal");
    }
  }

  public void printInfo(){
    System.out.println("No. Rekening: " + this.nomorRekening);
    System.out.println("Saldo: Rp " + this.saldo);
    nasabah.printInfo();
  }

  public int getNomorRekening(){
    return this.nomorRekening;
  }

  public int getSaldo(){
    return this.saldo;
  }

  public static Rekening daftar(Nasabah nasabah, int saldo){
    if((nasabah != null) && (saldo >= 50000)){
      Rekening A = new Rekening(nasabah, saldo);
      return A;
    } else{
      return null;
    }
  }
}