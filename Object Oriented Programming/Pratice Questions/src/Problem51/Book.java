package Problem51;

public class Book {
    static int totalBooks;
    static {
        totalBooks =0;
    }
    {
        totalBooks++;
    }
    String title;
    String author;
    String isbn;
    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println(this.title+" is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book : "+this.title );
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed (" +this.title+ "), Please Leave a review");
        }else {
            System.out.println(this.title+" is already in the library");
        }
    }
    boolean isBorrowed;

    Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    Book(String isbn){
        this("Unknown","Unknown",isbn);
    }

    public static void main(String [] args) {
        Book designOfThings = new Book("1234");
        Book autobiography = new Book("Himanshu's Talk","Himanshu Bisht","1125");
        System.out.println(getTotalBooks());
        autobiography.borrowBook();
        designOfThings.borrowBook();
        autobiography.borrowBook();
        autobiography.returnBook();
        autobiography.returnBook();
    }
}
