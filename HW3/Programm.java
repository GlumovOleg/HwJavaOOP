package HomeWork.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Добавить в своё генелогическое дерево использование стандартных интерфейсов из Java
 */

public class Programm {

    public static void main(String[] args) {
        Person person = new Men("Oleg", "N", 34);
        Person person1 = new Women("Olga", "N", 4);
        Person person2 = new Men("Leonid", "N", 7);
        Person person3 = new Women("Marina", "D", 32);
        Person person4 = new Women("Irina", "N", 30);
        Person person5 = new Men("Mikhail", "T", 35);

        Tree tree = new Tree();
        tree.addLink(person4, person, Relation.SPOUSES, Relation.SPOUSES);
        tree.addLink(person, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person3, Relation.SISTER, Relation.BROTHER);
        tree.addLink(person3, person2, Relation.BROTHER, Relation.SISTER);
        tree.addLink(person4, person5, Relation.BROTHER, Relation.SISTER);

        Research.printAllTree("Oleg", tree);

        System.out.println("---");

        List<Person> human = new ArrayList<>();

        human.add(person);
        human.add(person1);
        human.add(person2);
        human.add(person3);
        human.add(person4);
        human.add(person5);

        human.sort(new Age());
        System.out.println(human);

        System.out.println("---");

        human.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(human);

        System.out.println("---");

        Collections.sort(human);
        System.out.println(human);

        System.out.println("---");

        human.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
            
        });
        System.out.println(human);
    }
}
