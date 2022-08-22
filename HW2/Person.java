package HomeWork.HW2;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;

    protected Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }

    protected int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + 
                "name='" + name + '\'' + 
                ", surname = '" + surname + '\'' + 
                ", age = '" + age + '\'' + '}';
    }
}
