package c4q.com.mid_unit_4;

import java.util.ArrayList;

/**
 * Created by D on 12/20/17.
 */

public class Books {

    public class Book
    {
        private String title;

        public String getTitle() { return this.title; }

        public void setTitle(String title) { this.title = title; }

        private String author;

        public String getAuthor() { return this.author; }

        public void setAuthor(String author) { this.author = author; }

        private int year;

        public int getYear() { return this.year; }

        public void setYear(int year) { this.year = year; }
    }

    public class RootObject
    {
        private ArrayList<Book> books;

        public ArrayList<Book> getBooks() { return this.books; }

        public void setBooks(ArrayList<Book> books) { this.books = books; }
    }




}
