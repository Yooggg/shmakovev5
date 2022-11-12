package number4;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО читателя - ");
        Reader reader1 = new Reader(scanner.next());
        System.out.println("Введите кол-во книг, которые взял читатель -");

        int numbersOfBooks = scanner.nextInt();
        reader1.takeBook(numbersOfBooks);
        System.out.println();
        reader1.returnBook(numbersOfBooks);

        System.out.println();
        String[] booksNames = {"Приключение","Словарь","Энциклопедия"};
        reader1.takeBook(booksNames);
        System.out.println();
        reader1.returnBook(booksNames);

        System.out.println();
        Book[] booksList = {new Book("Приключение","Даня"),new Book("Словарь","Гриша"),new Book("Энциклопедия","Рома")};
        reader1.takeBook(booksList);
        System.out.println();
        reader1.returnBook(booksList);
    }
}
