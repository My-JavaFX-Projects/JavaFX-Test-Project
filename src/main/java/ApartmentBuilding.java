import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ApartmentBuilding extends HighRise implements Dwelling{
    public static int occupantsPerFloor;

    public ApartmentBuilding(String name, double xPosition,int occupantsPerFloor,int numberOfFloors) {
        super(name, xPosition,numberOfFloors);
        this.occupantsPerFloor = occupantsPerFloor;
    }


    private ApartmentBuilding create() {
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding("name",5,5,6);
        return apartmentBuilding;
    }

    public GraphicsContext draw(GraphicsContext graphicsContext) {
//        Canvas canvas = new Canvas(500,500);
//        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.DARKBLUE);
        graphicsContext.fillRect(250,200,90,180);
        return graphicsContext;
    }

    @Override
    public int getNumberOfOccupants() {
        return 100;
    }

    public String toString() {
        return "Jimi";
    }
}
