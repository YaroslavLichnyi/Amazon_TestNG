package org.example;

import org.example.entities.Book;
import org.example.pages.BookPage;
import org.example.pages.MainPage;
import org.example.pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverSettings{

    @Test
    public void bookIsInTheCollection()
    {
        MainPage mainPage = new MainPage();
        mainPage.open();
        mainPage.selectBoxItem(6);
        mainPage.doSearch("Java");
        SearchResultPage searchResultPage = new SearchResultPage();
        List<String> bookLinks = searchResultPage.getBookLinks();
        List<Book> bookList = new ArrayList<>();
        Book expectedBook = BookPage.getBook("https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_3");
        for (String url: bookLinks) {
            bookList.add(BookPage.getBook(url));
        }
        boolean expectedBookWasFound = false;
        for (Book book: bookList) {
            if (book.equals(expectedBook)){
                expectedBookWasFound = true;
            }
        }
        Assert.assertTrue(expectedBookWasFound);
    }
}