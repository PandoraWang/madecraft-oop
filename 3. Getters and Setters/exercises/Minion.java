package exercises;

public class Minion {


    private String name;
    private int eyes;
    private String color;
    private String master;

    public Minion(String name, int eyes, String color, String master) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.master = master;
    }

    public int getEyes() {
        return this.eyes;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
}
