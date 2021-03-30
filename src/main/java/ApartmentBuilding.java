import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Scanner;

public class ApartmentBuilding extends HighRise implements Dwelling{
    public  int occupantsPerFloor;

    public ApartmentBuilding(String name, double xPosition,int numberOfFloors,int occupantsPerFloor) {
        super(name, xPosition,numberOfFloors);
        this.occupantsPerFloor = occupantsPerFloor;
    }


    public static ApartmentBuilding create() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write the name of Apartment:");
        String nameOfApartment = userInput.nextLine();
        System.out.println("Write the number of floors:");
        int numberOfFloors = userInput.nextInt();
        System.out.println("Write the number of occupants per floor:");
        int numberOfOccupantsPerFloor = userInput.nextInt();
        return new ApartmentBuilding(nameOfApartment, 0,numberOfFloors,numberOfOccupantsPerFloor);
    }

    public void draw(GraphicsContext graphicsContext) {
        Village village = new Village("some",1);
        int heightOfAprtment = numberOfFloors*40+20;
        graphicsContext.setFill(Color.DARKBLUE);
        graphicsContext.fillRect(xPosition,village.getY_FLOOR()-heightOfAprtment,90,heightOfAprtment);
        for (int i =0; i<numberOfFloors; i++) {
            graphicsContext.setFill(Color.WHITE);
            graphicsContext.fillRect(xPosition + 10, village.getY_FLOOR() - heightOfAprtment+5+i*40, 25, 25);
            graphicsContext.setFill(Color.WHITE);
            graphicsContext.fillRect(xPosition + 55, village.getY_FLOOR() - heightOfAprtment+5+i*40, 25, 25);
        }
    }


    @Override
    public  int getNumberOfOccupants() {
        int occupants = occupantsPerFloor * numberOfFloors;
        return occupants;
    }

    public String toString() {
        String details = "ApartmentBuilding: occupantsPerFloor=" + occupantsPerFloor + "\n"
                + "Type... HighRise: numberOfFloors=" + numberOfFloors + "\n"
                + "Type...Building: name="+name + ", xPosition=" + xPosition + "\n";
        System.out.println(details);
        return details;
    }
}
