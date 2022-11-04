import java.util.Arrays;
import java.util.Calendar;

public class Reader {
    int gender;
    String name;
    String surname;
    String patronymic;
    int cardID;
    String faculty;
    Calendar birthdate;
    String phone;

    public Reader(String name, String surname, String patronymic, int cardID, String faculty, Calendar birthdate, String phone){
        this.birthdate = birthdate;
        this.cardID = cardID;
        this.faculty = faculty;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        if (this.patronymic.endsWith("а")) {
            this.gender = 0;
        } else {this.gender = 1;}
    }

    public String getFIO(){
        return this.surname + " " + this.name.charAt(0) +". " + this.patronymic.charAt(0) + ".";
    }

    public void takeBook(int numberOFBooks){
        System.out.println(this.getFIO() + this.getGenderTake() + numberOFBooks + this.rightBook(numberOFBooks));
    }

    public void takeBook(String... books){
        StringBuilder str = new StringBuilder(Arrays.toString(books));
        str.delete(0, 1);
        str.delete(str.length()-1, str.length());
        System.out.println(this.getFIO() + this.getGenderTake() + " книги: " + str + ".");

    }

    public void takeBook(Book... books){
        StringBuilder str = new StringBuilder();
        for (Book book:books
             ) {
            str.append(book.title);
            str.append(", ");
        }
        str.delete(str.length()-2, str.length());
        System.out.println(this.getFIO() + this.getGenderTake() + " книги: " +str + ".");

    }


    public void returnBook(int numberOFBooks){
        System.out.println(this.getFIO() + this.getGenderReturn() + numberOFBooks + this.rightBook(numberOFBooks));
    }

    public void returnBook(String... books){
        StringBuilder str = new StringBuilder(Arrays.toString(books));
        str.delete(0, 1);
        str.delete(str.length()-1, str.length());
        System.out.println(this.getFIO() + this.getGenderReturn() + " книги: " + str + ".");

    }

    public void returnBook(Book... books){
        StringBuilder str = new StringBuilder();
        for (Book book:books
        ) {
            str.append(book.title);
            str.append(", ");
        }
        str.delete(str.length()-2, str.length());
        System.out.println(this.getFIO() + this.getGenderReturn() + " книги: " +str + ".");

    }


    private String getGenderTake(){
        if (this.gender == 0) {return " взяла ";}
        else {return " взял ";}
    }
    private String getGenderReturn(){
        if (this.gender == 0) {return " вернула ";}
        else {return " вернул ";}
    }
    private String rightBook(int n){
        if (n%100==10 || n%100==11|| n%100==12 || n%100==13||n%100==14||n%100==15||n%100==16||n%100==17||n%100==18||n%100==19){
            return " книг.";
        } else if (n%10==1){
            return " книгу.";
        } else if (n%10==2||n%10==3||n%10==4){
            return " книги.";
        } else{
            return " книг.";
        }
    }
}
