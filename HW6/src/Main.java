public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров А.А",
                                    823515,
                                    "Программирование",
                                    "20.12.2000",
                                    "+7 (950) 878-85-33");
        Reader reader2 = new Reader("Иванов К.Г",
                                    963127,
                                    "Аналитика",
                                    "01.09.2001",
                                    "+7 (900) 852-44-02");
        Book book1 = new Book("Совершенный код", "С. Макконнелл");
        Book book2 = new Book("Основы Python", "Аллен Б. Дауни");

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(book1);
        System.out.println(book2);
        reader1.takeBook(4);
        reader2.takeBook("Приключения","Словарь","Энциклопедия");
        reader1.takeBook(book1,book2, new Book("Структуры данных и алгоритмы в Java", "Р. Лафоре"));
        reader2.returnBook(book2,book1);
    }

}