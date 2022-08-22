package HomeWork.HW2;

public class Link {
    private Person personFirstName;
    private Person personLastName;
    private Relation link;

    public Link(Person personFirstName, Person personLastName, Relation link) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.link = link;
    }

    public Person getPersonFirstName() {
        return personFirstName;
    }

    public Person getPersonLastName() {
        return personLastName;
    }

    public Relation getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "personFirst=" + personFirstName +
                ", personSecond=" + personLastName +
                ", link=" + link +
                '}';
    }

}
