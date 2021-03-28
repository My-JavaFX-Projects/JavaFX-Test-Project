import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;



public class StarterOfProgram extends Application {
    private void painting(Stage stage) {

        House house = new House("name",5,6,6);
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding("jimi",5,6,6);

        house.toString();
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500, Color.YELLOW);
//        Canvas houseCanvas = new Canvas();
        Canvas apartmantBuildingCanvas = new Canvas();
        GraphicsContext graphicsContext = apartmantBuildingCanvas.getGraphicsContext2D();
        apartmentBuilding.draw(graphicsContext);
        root.getChildren().addAll(apartmantBuildingCanvas);
        stage.setTitle("Jimi's Village, Auhtor is Jimi");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        painting(stage);
    }
}
