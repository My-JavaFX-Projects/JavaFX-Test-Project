public class HighRise extends Building{
    public  int numberOfFloors;

    public HighRise(String name, double xPosition,int numberOfFloors) {
        super(name, xPosition);
        this.numberOfFloors = numberOfFloors;
    }


    public  int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String toString() {
        return null;
    }
}
