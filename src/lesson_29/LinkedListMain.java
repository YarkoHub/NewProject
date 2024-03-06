package lesson_29;


import util.MyLinkedList;

import java.util.Arrays;

public class LinkedListMain {


    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        System.out.println(linkedList);

        linkedList.add(100);
        System.out.println(linkedList);
        linkedList.addFirst(50);

        System.out.println(linkedList);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.addFirst(10);

        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);

        System.out.println("Remove value: " + linkedList.remove());
        System.out.println("Remove value: " + linkedList.remove());
        System.out.println("Remove value: " + linkedList.remove());

        System.out.println(linkedList);

        System.out.println("Remove value: " + linkedList.remove());
        System.out.println("Remove value: " + linkedList.remove());


        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.addFirst(50);
        linkedList.addFirst(10);

        System.out.println(linkedList);




        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());
        System.out.println("Remove last: " + linkedList.removeLast());

        System.out.println(linkedList);

        linkedList.add(555);
        System.out.println(linkedList);


        System.out.println("lastIndexOf(555): " + linkedList.lastIndexOf(555));

        System.out.println("\n=====================");

        linkedList.addAll(0, 1, 2, 3, 4, 5, 6 ,7);
        System.out.println(linkedList);

        int index = linkedList.indexOf(3);
        System.out.println("Index 3: " + index);

        System.out.println(linkedList.indexOf(7));
        System.out.println(linkedList.indexOf(100));

        Integer[] result = linkedList.toArray();
        System.out.println(Arrays.toString(result));

    }
}
