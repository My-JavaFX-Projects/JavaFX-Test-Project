import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Scanner;

public class House extends Building implements Dwelling{
    public  int bedrooms;
    public  int occupants;

    public House(String name, double xPosition, int bedrooms, int occupants) {
        super(name, xPosition);
        this.bedrooms = bedrooms;
        this.occupants = occupants;
    }



     public static House create(){
         Scanner userInput = new Scanner(System.in);
         System.out.println("Write the name of House:");
         String houseName = userInput.nextLine();
         System.out.println("Write the bedroom number of house:");
         int houseBedroomNumber = userInput.nextInt();
         System.out.println("Write the number of occupants in house:");
         int houseOccupantNumber = userInput.nextInt();
         return new House(houseName,0,houseBedroomNumber,houseOccupantNumber);
     }


    @Override
    public  int getNumberOfOccupants() {

        return occupants;
    }

    public  int getBedrooms() {
        return bedrooms;
    }



    public String toString() {
        String details = "House: bedrooms= " + getBedrooms()+", occupants= "+getNumberOfOccupants() + "\n"
                + "Type...Building: name="+name+", xPosition="+xPosition + "\n";
        System.out.println(details);
        return details;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        Village village = new Village("some",1);

        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(xPosition,village.getY_FLOOR()-90,90,90);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(xPosition+5,village.getY_FLOOR()-70,25,25);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(xPosition+60,village.getY_FLOOR()-70,25,25);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(xPosition+35,village.getY_FLOOR()-45,20,45);
    }
}
