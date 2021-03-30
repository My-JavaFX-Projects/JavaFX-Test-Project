import javafx.scene.canvas.GraphicsContext;

public class Main{



    public static void main(String[] args) {
        Village village = Village.create();

        village.draw();
        System.out.println("The population of village is: " + village.getPopulation());

    }
}
