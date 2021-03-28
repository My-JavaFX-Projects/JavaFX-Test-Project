import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Building implements Drawable {
    public static String name;
    public static double xPosition;


    @Override
    public GraphicsContext draw(GraphicsContext graphicsContext) {
        return null;
    }

    @Override
    public double getXPosition() {
        return xPosition;
    }


    public  String toString() {
        String details = "Type... Building: name = "+ name +", xposition= "+xPosition;
        System.out.println(details);
        return details;
    }

    public Building() {

    }
    public  Building( String name, double xPosition ) {
        this.name = name;
        this.xPosition = xPosition;
    }

    public static String getName() {
        return name;
    }




}
