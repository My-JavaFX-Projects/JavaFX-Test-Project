import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import java.util.ArrayList;

public class StarterOfProgram extends Application {
    public static String nameOfVillage;
    public static  Building[] buildings;

    public static Building[] getBuildings() {
        return buildings;
    }

    public static void setBuildings(Building[] buildings) {
        StarterOfProgram.buildings = buildings;
    }

    public String getNameOfVillage() {
        return nameOfVillage;
    }

    public void setNameOfVillage(String nameOfVillage) {
        this.nameOfVillage = nameOfVillage;
    }

    private void painting(Stage stage) {
        Village village = new Village("someVillage", 5);
        Label label = new Label(getNameOfVillage());
        label.setTranslateX(30);
        label.setTranslateY(50);
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.YELLOW);
        final Canvas canvas = new Canvas(500,500);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        int xPositionOfBuilding = 30;
        ArrayList<Label> labels = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            buildings[i].setxPosition(xPositionOfBuilding);
            buildings[i].draw(graphicsContext);
            labels.add(new Label(buildings[i].name));
            labels.get(i).setTranslateY(village.getY_FLOOR()+10);
            labels.get(i).setTranslateX(xPositionOfBuilding);
            root.getChildren().add(labels.get(i));
            xPositionOfBuilding +=120;

        }

        root.getChildren().addAll(canvas,label);
        stage.setTitle("Small Village");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        painting(stage);
    }
}
