package de.ait.lesson44.Homework;

/*Создайте два (или больше) конкретных класса-наследника Book:

PaperBook:
Дополнительное поле: int pages (количество страниц).
Переопределённый метод getDescription(), возвращающий строку вида:
"Paper Book: <title> by <author> (<pages> pages)"*/

public class PaperBook extends Book{
    private int pages;

    public PaperBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void getDescription() {
        System.out.println("Paper Book: " + getTitle() + " by " + getAuthor() + " (" + pages + " pages)");
    }
}
