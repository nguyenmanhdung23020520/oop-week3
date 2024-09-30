public class Person{
    private   String name;
    private  int BornYear;

    public Person(String name, int bornYear) {
        this.name = name;
        BornYear = bornYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return BornYear;
    }

    public void setBornYear(int bornYear) {
        BornYear = bornYear;
    }
}
