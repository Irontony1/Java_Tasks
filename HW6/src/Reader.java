import java.util.Arrays;
import java.util.StringJoiner;

class Reader {
    private final String fullName;
    private final int ticketNumber;
    private final String faculty;
    private final String birthday;
    private final String numberPhone;

    public Reader(String fullName, int ticketNumber, String faculty, String birthday, String numberPhone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Информация о читателе: \n" +
                "ФИО - " + fullName + "\n" +
                "Номер билета - " + ticketNumber + "\n" +
                "Факультет - " + faculty + "\n" +
                "День рождения - " + birthday + "\n" +
                "Телефон - " + numberPhone + "\n";
    }

    public void takeBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книгу";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else strBook = "книг";

        System.out.printf("%s взял %s %s\n",fullName,count, strBook);
    }

    public void returnBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книгу";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else strBook = "книг";

        System.out.printf("%s вернул %s %s\n",fullName,count, strBook);
    }

    public void takeBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (String book : books) {
            sj.add(book);
        }
        System.out.printf("%s взял книги: %s\n",fullName, sj);
    }

    public void returnBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (String book : books) {
            sj.add(book);
        }
        System.out.printf("%s вернул книги: %s\n",fullName, sj);
    }

    public void takeBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (Book book : books) {
            sj.add(book.toString());
        }
        System.out.printf("%s взял книги: %s\n",fullName, sj);
    }

    public void returnBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        for (Book book : books) {
            sj.add(book.toString());
        }
        System.out.printf("%s вернул книги: %s\n",fullName, sj);
    }
}