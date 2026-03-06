import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> daftarTugas = new LinkedList<>();

        
        daftarTugas.add("Belajar Java");      
        daftarTugas.addFirst("NGOPI");     
        daftarTugas.addLast("Tidur");        

        
        System.out.println("Tugas pertama: " + daftarTugas.getFirst());

        
        daftarTugas.remove("Belajar Java");
        daftarTugas.removeFirst();      
    }
}