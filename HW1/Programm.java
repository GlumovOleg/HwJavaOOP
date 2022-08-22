package HomeWork.HW1;

import java.io.FileWriter;

public class Programm {

    public static void main(String[] args) {
        Person person = new Person("Oleg", "N");
        Person person1 = new Person("Olga", "N");
        Person person2 = new Person("Leonid", "N");
        Person person3 = new Person("Marina", "D");
        Person person4 = new Person("Irina", "N");

        Tree tree = new Tree();
        tree.addLink(person4, person, Relation.SPOUSES, Relation.SPOUSES);
        tree.addLink(person, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person3, Relation.SISTER, Relation.BROTHER);
        tree.addLink(person3, person2, Relation.BROTHER, Relation.SISTER);

        Research.printAllTree("Oleg", tree);

        try (FileWriter fileWrite = new FileWriter("C:/Users/Darek/OneDrive/Документы/ГБ/JavaOOP/HomeWork/HW1/Tree.txt")) {
            System.out.println("Запись прошла успешно");
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}
