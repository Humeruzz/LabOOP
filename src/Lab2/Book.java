package Lab2;

public class Book {
    private String author, name ,date;

    public Book(String temp) {
        String[] str = temp.trim().split(" ");
        if (str.length == 3) {
            this.author = str[0];
            this.name = str[1];
            this.date = str[2];
        }
    }

    public Book() {
        this.author = "";
        this.name = "";
        this.date = "";
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String output() {
        return "The book is:\n" +
                "author='" + author + '\'' +
                "\nname='" + name + '\'' +
                "\ndate='" + date + '\'';
    }
}
