public class DemoLinkedList {

    Element head;

    public void tambah(int data) {
        Element baru = new Element(data);

        if (head == null) {
            head = baru;
        } else {
            Element current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }

    public void tampil() {
        Element current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DemoLinkedList list = new DemoLinkedList();

        list.tambah(10);
        list.tambah(20);
        list.tambah(30);

        list.tampil();
    }
}
