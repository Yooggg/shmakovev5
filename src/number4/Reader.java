package number4;

public class Reader {
    private String FIO;
    private int ticketNum;
    private String facultetus;
    private String birthDate;
    private String phoneNumber;

    public Reader(String FIO) {
        this.FIO = FIO;
    }

    public void takeBook(int num){
        System.out.println(FIO + " взял " + num + " книги");
    }
    public void takeBook(String... bookNames){
        System.out.println(FIO + " взял книги: ");
        for (String bookName: bookNames) {
            System.out.print(bookName + ", ");
        }
    }
    public void takeBook(Book... obj){
        System.out.println(FIO + " взял книги: ");
        for (Book o: obj) {
            System.out.print(o.getBookName() + " ");
        }
    }

    public void returnBook(int num){
        System.out.println(FIO + " вернул " + num + " книги");
    }
    public void returnBook(String... bookNames){
        System.out.println(FIO + " вернул книги: ");
        for (String bookName: bookNames) {
            System.out.print(bookName + " ");
        }
    }
    public void returnBook(Book... obj){
        System.out.println(FIO + " вернул книги: ");
        for (Book o: obj) {
            System.out.print(o.getBookName() + " ");
        }
    }
}
