import java.lang.Math;

public class Animal {
    protected int numberOfLegs;
    protected Point position; 
    
    // Membuat Animal dengan jumlah kaki yang berdiri di titik (x, y)
    public Animal(int numberOfLegs, int x, int y){
    	this.numberOfLegs=numberOfLegs;
    	this.position=new Point(x,y);
    }

    // Mengeluarkan standpoint dari Animal
    public Point getPosition(){
    	return this.position;
    }

    // Posisi Animal diassign dengan p
    public void setPosition(Point p){
    	this.position=p;
    }

    // Posisi Animal diassign dengan (x, y);
    public void setPosition(int x, int y){
    	this.position=new Point(x,y);
    }

    // Posisi Animal berubah sebesar p
    public void movePosition(Point p){
    	int xt = this.position.getX();
    	int yt = this.position.getY();
    	int xp = p.getX();
    	int yp = p.getY();
    	this.position=new Point(xt+xp,yt+yp);	
    }

    // Posisi Animal berubah sebesar (x,y)
    public void movePosition(int x, int y){
    	int xt = this.position.getX();
    	int yt = this.position.getY();
    	this.position=new Point(xt+x,yt+y);
    }

    // Menghitung jarak antara Animal dengan titik (0,0)
    public double distanceFromZero(){
    	return Math.sqrt(Math.pow(position.getX(),2) + Math.pow(position.getY(),2));
    }

    // Melakukan pencetakan dengan format "Hewan ini berkaki X"
    public void print(){
    	System.out.println("Hewan ini berkaki "+this.numberOfLegs);
    }
}
