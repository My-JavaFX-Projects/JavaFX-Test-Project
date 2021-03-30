import javafx.scene.canvas.GraphicsContext;

public class Building implements Drawable {
    public  String name;
    public  double xPosition;

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
    }

    @Override
    public double getXPosition() {

        return xPosition;
    }

    public  String toString() {
        String details = "Type... Building: name = "+ name +", xPosition= "+xPosition;
        System.out.println(details);
        return details;
    }

    public  Building( String name, double xPosition ) {
        this.name = name;
        this.xPosition = xPosition;
    }


    public  String getName() {
        return this.name;
    }

}
