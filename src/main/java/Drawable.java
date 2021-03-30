import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface Drawable {
   public abstract void draw(GraphicsContext graphicsContext);

    public abstract double getXPosition();
}
