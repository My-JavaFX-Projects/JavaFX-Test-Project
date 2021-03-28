import javafx.scene.canvas.GraphicsContext;

import java.util.Scanner;

public class House extends Building implements Dwelling{
    public static int bedrooms;

    public static int occupants;



    public House(String name, double xPosition,int bedrooms, int occupants) {
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

        return  new House(houseName, 0, houseBedroomNumber, houseOccupantNumber);
     }


    @Override
    public  int getNumberOfOccupants() {

        return occupants;
    }



    public String toString() {
        String details = "House: bedrooms= " + bedrooms+", occupants= "+occupants + "\n"
                + "Type...Building: name="+name+", xPosition="+xPosition;
        System.out.println(details);
        return details;
    }

    @Override
    public GraphicsContext draw(GraphicsContext graphicsContext) {
        return null;

    }
}
