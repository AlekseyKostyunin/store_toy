public class Toy implements Comparable<Toy>{ // основные параметры игрушки, включаем Comparable для метода comparableTo
    private static int id;
    public String name;
    public int count;
    public int weight;


    public Toy(String name, int count, int weight) {
        this.name = name;
        this.count = count;
        this.weight = weight;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getWeight(){
        return weight;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.weight, other.weight);
    }
}
