import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fileHandler);
        // для первой и третьей задачи
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(11);
        list.add(12);
        list.add(38);
        list.add(3);
        list.add(10);
        System.out.print("Исходный список: " + list);
//        list = reverseLinkedList(list);
//        System.out.print("\nПеревернутый список: " + list);
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */

//        SomeQueue list = new SomeQueue();
//        list.add(11);
//        list.add(12);
//        list.add(38);
//        list.add(3);
//        list.add(10);
//
//        System.out.print("Исходный список: " + list);
//
//        list.enqueue(1);
//        System.out.print("\nПомещает элемент в конец очереди: " + list);
//        System.out.print("\nВозвращает первый элемент из очереди и удаляет его: " + list.dequeue() + "; " + list);
//        System.out.print("\nВозвращает первый элемент из очереди, не удаляя: " + list.first());

/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор
 */
        Iterator<Integer> col = list.iterator();
        System.out.println();
        int sum = 0;

        while (col.hasNext()) {

            sum = sum + col.next();
        }
        System.out.println(sum);


        fileHandler.close();

    }



    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list)
    {
        /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
         */
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {

            // Добавляет элементы в обратном порядке
            revLinkedList.add(list.get(i));
        }
        // Возвращает перевернутый список
        return revLinkedList;
    }



}