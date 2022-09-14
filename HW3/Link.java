package HomeWork.HW3;

public class Link {
    private Person person1;
    private Person person2;
    private Relation link;

    public Link(Person person1, Person person2, Relation link) {
        this.person1 = person1;
        this.person2 = person2;
        this.link = link;
    }

    public Person getperson1() {
        return person1;
    }

    public Person getperson2() {
        return person2;
    }

    public Relation getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + person1 +
                ", personSecond=" + person2 +
                ", link=" + link +
                '}';
    }

}
