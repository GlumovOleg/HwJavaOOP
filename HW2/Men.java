package HomeWork.HW2;

public class Men extends Person {

    public Men(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    protected int getAge() {
        return super.getAge();
    }

    @Override
    protected String getName() {
        return super.getName();
    }

    @Override
    protected String getSurname() {
        return super.getSurname();
    }

}
