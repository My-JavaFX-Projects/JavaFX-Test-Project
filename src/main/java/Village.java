import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Village extends Building {
    private double Y_FLOOR = 50;
    public static int size;
    public static String name;
    public static Building[] buildings;

    public Village(String name, int size) {

        this.name = name;
        this.size = size;
        buildings = new Building[size];

    }


    public static Village create() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write the name of Village:");
        String villageName = userInput.nextLine();
        System.out.println("Write the size of Village:");
        int villageSize = userInput.nextInt();
        Village village = new Village(villageName,villageSize);
//        for(int i=0; i< buildings.length; i++){
            buildings[0] = new House("jimi1", 1, 1, 1);
        buildings[1] = new House("jimi2", 2, 2, 2);


//        }
        System.out.println(Arrays.toString(buildings));
        int populationOfVillage = village.getPopulation();
        System.out.println("The population of Village:"+populationOfVillage);

        return village;
    }

    public  int getPopulation() {
        int population = 0;
        for(int i=0; i< buildings.length; i++){
//            population = population +buildings[i].;
        }

        return population;
    }

//    public Canvas draw(GraphicsContext graphicsContext) {
//        Canvas
//    }
    public static int getSize() {
        return size;
    }

    public String toString() {
        System.out.println("Village of "+this.name);

        for(int j=0; j< buildings.length; j++){
            System.out.println(buildings[j].toString());
        }
        return this.name;
    }

//    public Building getBuilding(String type) {
//        if (type == null) {
//            return null;
//        }
//        if (type == "house") {
//            return new House();
//        }
//        return null;
//
//    }
}
