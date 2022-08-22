package HomeWork.HW2;
/*
 *  К задачам из предыдущего дз добавить абстракции и интерфейсы.
 * Продумать иерархию компонент и взаимодействия их
    между собой.
    Обеспечить переход от использования явных классов в сторону использования абстрактных типов.
 Т.е. работаем не с конкретным экземпляром генеалогического древа,
 а с абстрактным классом “генеалогическое древо” или не с конкретным человеком,
 а с абстрактным человеком.
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
    }
}
