/**
 * KebunBinatang.java
 * [Jelaskan kegunaan class ini]
 * @author 18221162 Ceavin Rufus De Prayer Purba
 */

import java.util.Scanner;

public class KebunBinatang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt(); 

        if (number == 1) {
            int children = input.nextInt();
            int telur = input.nextInt();
            Elang hewan = new Elang(5);

            for (int i = 0; i < telur; i++) {
                hewan.bertelur();
            }
            hewan.increaseChild(children);

            System.out.println("Number of Legs: " + 2 + ", Child: " + hewan.getNumberOfChildren());
            System.out.println("Jumlah Telur: " + telur);
            System.out.println("Animal Power: " + hewan.getAnimalPower());
        } else if (number == 2){
            int children = input.nextInt();
            int gading = input.nextInt();
            Gajah hewan = new Gajah(10, gading);

            hewan.increaseChild(children);
            
            System.out.println("Number of Legs: " + 4 + ", Child: " + hewan.getNumberOfChildren());
            System.out.println("Jumlah Gading: " + hewan.getJumlahGading());
            System.out.println("Animal Power: " + hewan.getAnimalPower());
        } else if (number == 3){
            int children = input.nextInt();
            Boolean kawanan = input.nextBoolean();
            Serigala hewan = new Serigala(10, kawanan);

            hewan.increaseChild(children);
            
            System.out.println("Number of Legs: " + 4 + ", Child: " + hewan.getNumberOfChildren());
            if (kawanan){
                System.out.println("Serigala berada di dalam kawanan");
            } else {
                System.out.println("Serigala tidak berada di dalam kawanan");
            }
            System.out.println("Animal Power: " + hewan.getAnimalPower());
        }
    }
}