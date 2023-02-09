/**
 * DuniaRobot.java
 * [Jelaskan kegunaan class ini]
 * @author 18221162 Ceavin Rufus De Prayer Purba
 */

import java.util.Scanner;

public class DuniaRobot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt(); 

        if (number == 1) {
            int parts = input.nextInt();
            int transform = input.nextInt();
            Boolean active = input.nextBoolean();
            Bumblebee robot = new Bumblebee(parts, active);

            for (int i = 0; i < transform; i++) {
                robot.addTransformation();
            }

            System.out.println("Number of Parts: " + parts + ", IsActive: " + active);
            System.out.println("Jumlah transformasi: " + robot.getTotalTransformation());
            System.out.println("Harga robot: " + robot.getPrice());
        } else if (number == 2){
            int price = input.nextInt();
            int model = input.nextInt();
            Sirik robot = new Sirik(price);

            for (int i = 0; i < model; i++) {
                robot.addModel();
            }
            
            System.out.println("Number of Parts: " + robot.getNumberOfParts() + ", IsActive: " + robot.getIsActive());
            System.out.println("Jumlah model: " + robot.getTotalModel());
            System.out.println("Harga robot: " + robot.getPrice());
        } else if (number == 3){
            int mileage = input.nextInt();
            Boolean active = input.nextBoolean();
            WallE robot = new WallE(mileage, active);

            System.out.println("Number of Parts: " + robot.getNumberOfParts() + ", IsActive: " + active);
            System.out.println("Jumlah mileage: " + mileage);
            System.out.println("Harga robot: " + robot.getPrice());
        }
    }
}
