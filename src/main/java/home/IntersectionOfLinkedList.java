package home;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfLinkedList {

    //I have used stream() for iterate my lists
    public List<String> getIntersectionOfLinkedList(LinkedList<String> list1, LinkedList<String> list2) {
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        IntersectionOfLinkedList intersectionOfLinkedList=new IntersectionOfLinkedList();
        //1st list created
        LinkedList<String> list1=new LinkedList<>();
        list1.add("Zeynab");
        list1.add("Turan");
        list1.add("Tebriz");
        list1.add("Elnare");
        list1.add("Mubariz");
        //2nd list created
        LinkedList<String> list2=new LinkedList<>();
        list2.add("Zeynab");
        list2.add("Aysel");
        list2.add("Tebriz");
        list2.add("Gulnar");
        list2.add("Shamil");
        System.out.println(intersectionOfLinkedList.getIntersectionOfLinkedList(list1,list2));

    }
}
