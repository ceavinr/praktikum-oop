/**
 * Sadako.java
 * [Jelaskan kegunaan class ini]
 */
public class Sadako extends Setan{
    public Sadako(){
        super("Sadako","Jepang");
    }
    public void sayHi(){
        System.out.println("Konichiwa! Aku "+getNama()+". Aku Dari "+getNegara()+".");
    }
}