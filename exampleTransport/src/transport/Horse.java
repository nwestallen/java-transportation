package transport;

public class Horse implements Animal, Vehicle {
   
    private int fuel = 0;
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        this.fuel --;
    }

    @Override
    public void eat(int i) {
        this.fuel += i;
    }

    @Override
    public String speak() {
        return "Neigh!";
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public int getFuelLevel() {
        return this.fuel;
    }

    @Override
    public void addFuel(int i) {
        this.eat(i);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override 
    public String toString() {
        return "Horse name: " + name + " fuel: "  + fuel;
    }

}
