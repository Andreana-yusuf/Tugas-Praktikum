class Element {
   
    String isi;
    Element berikutnya; 
    Element sebelumnya;

   
    public Element(String isi) {
        this.isi = isi;
        this.berikutnya = null;
        this.sebelumnya = null;
    }
}