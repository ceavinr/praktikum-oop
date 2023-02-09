public class Monkey extends Animal {
    // Melakukan assign numberOfLegs = 2 dan posisi pada x = 0, y = 0
    public Monkey(){
        super(2,0,0);
    }

    // Melakukan assign numberOfLegs = 0 dan posisi pada x, y
    // Jika nilai y pada posisi tidak valid, nilai y dirubah ke nilai y terdekat yang valid.
    public Monkey(int x, int y){
        super(2,x,y);

        if(y<0){
           super.setPosition(x,0);
        }
    }

    // Mencetak suara burung, "Uu..Aa.."
    public void makeSound(){
        System.out.println("Uu..Aa..");
    }

    // Menyelam sejauh nilai x dan y
    // Jika y tidak valid, nilai y dirubah ke nilai y terdekat yang valid.
    public void move(int x, int y){
        if(this.position.getY()+y>=0){
            super.movePosition(x,y);
        } else{
            super.movePosition(x,-this.position.getY());
        }
    }

    // Melakukan pencetakan dengan format 
    // "Hewan ini berkaki 2 dan Hewan ini adalah monyet"
    // "Posisi: x, y"
    public void print(){
        System.out.println("Hewan ini berkaki 2 dan Hewan ini adalah monyet");
        System.out.println("Posisi: "+position.getX()+", "+position.getY());
    }
}
