public class Main {
    public static void main(String[] args){
        // tao 1 cuon sach
        Book book1 = new Book("Kim Binh Mai",100,200,"Long"); //book1 là 1 đối tượng dược tạo ra từ lớp Book
        // book 1 là 1 instance của lớp Book
        System.out.println("Tên sách: "+book1.bookName);
        Book book2 = new Book("Co Giao Thao",200,500,"Dat");
        System.out.println("Name: "+book2.bookName);
    }

}