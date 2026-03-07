public class LinkedList {

    Elemen head;
    Elemen tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    // append (tambah belakang)
    public void append(String value) {
        Elemen newElemen = new Elemen(value);

        if (head == null) {
            head = newElemen;
            tail = newElemen;
        } else {
            tail.next = newElemen;
            newElemen.prev = tail;
            tail = newElemen;
        }
    }

    // prepend (tambah depan)
    public void prepend(String value) {
        Elemen newElemen = new Elemen(value);

        if (head == null) {
            head = newElemen;
            tail = newElemen;
        } else {
            newElemen.next = head;
            head.prev = newElemen;
            head = newElemen;
        }
    }

    // hitung element
    public int count() {
        int total = 0;
        Elemen current = head;

        while (current != null) {
            total++;
            current = current.next;
        }

        return total;
    }

    // tampilkan semua
    public void showAll() {
        Elemen current = head;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        System.out.println();
    }

    // tampilkan element berdasarkan index
    public void showElement(int index) {
        Elemen current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                System.out.println("Element di index " + index + " : " + current.value);
                return;
            }
            i++;
            current = current.next;
        }

        System.out.println("Index tidak ditemukan");
    }

    // insert di tengah
    public void insertAt(int index, String value) {
        if (index == 0) {
            prepend(value);
            return;
        }

        Elemen newElemen = new Elemen(value);
        Elemen current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index tidak valid");
            return;
        }

        newElemen.next = current.next;
        newElemen.prev = current;

        if (current.next != null) {
            current.next.prev = newElemen;
        }

        current.next = newElemen;
    }
}