package HomeWork.HW3;

import java.util.List;

public class Research {

    public static void printAllTree(String name, Tree tree) {
        List<Link> links = tree.getLinks();


        for (Link el : links) {
            if (el.getperson1().getName().equals(name) &&
                    el.getLink() == Relation.SPOUSES) {
                System.out.println(el.getperson2() + " " + "Муж и Жена");
            }
        }

        for (Link el : links) {
            if (el.getperson1().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println(el.getperson2() + " " + "Ребёнок");
            }
        }

        for (Link el : links) {
            if (el.getperson1().getName().equals(name) &&
                    el.getLink() == Relation.SISTER) {
                System.out.println(el.getperson2() + " " + "Сестра");
            }
        }

        for (Link el : links) {
            if (el.getperson1().getName().equals(name) &&
                    el.getLink() == Relation.BROTHER) {
                System.out.println(el.getperson2() + " " + "Брат");
            }
        }
        
    }

}
