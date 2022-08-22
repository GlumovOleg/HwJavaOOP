package HomeWork.HW2;

public class Women extends Person {

    public Women(String name, String surname, int age) {
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
