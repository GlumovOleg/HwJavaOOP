package HomeWork.HW1;

import java.util.List;

public class Research {
    public static void printAllTree(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirstName().getName().equals(name) &&
                    el.getLink() == Relation.SPOUSES) {
                System.out.println(el.getPersonLastName() + " " + "Муж и Жена");
            }
        }

        for (Link el : links) {
            if (el.getPersonFirstName().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonLastName() + " " + "Ребёнок");
            }
        }

        for (Link el : links) {
            if (el.getPersonFirstName().getName().equals(name) &&
                    el.getLink() == Relation.SISTER) {
                System.out.println(el.getPersonLastName() + " " + "Сестра");
            }
        }

        for (Link el : links) {
            if (el.getPersonFirstName().getName().equals(name) &&
                    el.getLink() == Relation.BROTHER) {
                System.out.println(el.getPersonLastName() + " " + "Брат");
            }
        }
    }
}
