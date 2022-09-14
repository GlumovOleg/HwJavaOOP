package HomeWork.HW3;

abstract class Person implements Comparable<Person> {

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
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person" + " " + this.name + 
        " [age:" + age + ", name:" + name + ", surname:" + surname + "]" + "\n";
    }

}
