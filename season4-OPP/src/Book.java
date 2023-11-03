public class Book {
    // thuộc tính( thuộc tính instan)
    String bookName = "Sex and City";
    double bookPrice;
    int totalPages;
    String authorName;
    // tồn tại 1 constructor (phương thức khởi tạo dối tượng) mặc dịnh không tham số nếu không định nghĩa
    public Book(String bookName,double bookPrice,int totalPages,String authorName){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.totalPages = totalPages;
        this.authorName = authorName;

    }

    // phương thức
    public void read(){
        System.out.println("Reading");
    }
}
