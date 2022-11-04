import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Василий", "Петров", "Васильевич", 10001 , "ЮР", new GregorianCalendar(1990, Calendar.FEBRUARY, 25), "9999991");
        Reader reader2 = new Reader("Андрей", "Иванов", "Сергеевич", 10002 , "ПИ", new GregorianCalendar(2000, Calendar.DECEMBER, 12), "9999992");
        Reader reader3 = new Reader("Ангелина", "Сидорова", "Александровна", 10003 , "МЕН", new GregorianCalendar(2003, Calendar.MAY, 3), "9999993");
        Reader reader4 = new Reader("Елена", "Смирнова", "Николаевна", 10004 , "ЖУР", new GregorianCalendar(1998, Calendar.JUNE, 7), "9999994");

        Reader[] readers = {reader1, reader2, reader3, reader4};

        for (Reader r:readers) {
            System.out.println(r.getFIO());
        }

        System.out.println("\nПо количеству");
        reader1.takeBook(101);
        reader2.takeBook(211);
        reader3.returnBook(0);
        reader4.returnBook(78);
        reader1.returnBook(52);

        System.out.println("\nПо названию");
        reader1.takeBook("Приключения", "Словарь");
        reader1.returnBook("Словарь", "Энциклопедия");

        System.out.println("\nПо классу Book");

        Book book1 = new Book("Приключения", "Кинг");
        Book book2 = new Book("Словарь", "Даль");
        Book book3 = new Book("Энциклопедия", "Браун");

        reader1.takeBook(book1, book2, book3);
        reader3.returnBook(book2, book3, book1);

    }
}