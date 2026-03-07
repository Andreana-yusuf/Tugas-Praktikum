public class DemoLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.append("A");
        list.append("B");
        list.append("C");

        list.prepend("Start");

        list.insertAt(2, "Middle");

        System.out.println("Semua element:");
        list.showAll();

        System.out.println("Jumlah element: " + list.count());

        list.showElement(2);
    }
}