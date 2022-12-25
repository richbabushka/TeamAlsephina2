package Alisher;

public class Team {
    private  String name;
    private String power,weakness;

    public Team(String name, String power, String weakness) {
        this.name = name;
        this.power = power;
        setWeakness(weakness);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        if(power.equalsIgnoreCase("finish")){
            System.err.println("Impossible move forward.All Team hurt");
            System.exit(1);
        }
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        if(weakness.equalsIgnoreCase("Lazy")||weakness.equalsIgnoreCase("no time")||weakness.equalsIgnoreCase("impossible")){
            System.err.println("Impossible move forward.All Team hurt");
            System.exit(1);

        }
        this.weakness = weakness;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", weakness='" + weakness + '\'' +
                '}';
    }
}
