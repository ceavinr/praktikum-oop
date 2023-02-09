/**
 * Vampir.java
 * [Jelaskan kegunaan class ini]
 */
class Vampir extends Setan{
    public Vampir(){
        super("Vampir","China");
    }
    public void sayHi(){
        System.out.println("Ni Hao! Aku "+getNama()+". Aku Dari "+getNegara()+".");
    }
}