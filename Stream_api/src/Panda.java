public class Panda {
    private String title;
    private double weight;
    public void eatBamboo(){
        weight += 100;
    }

    public Panda(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
