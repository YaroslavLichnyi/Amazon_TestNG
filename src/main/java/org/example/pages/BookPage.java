package org.example.pages;

import org.example.entities.Book;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class BookPage extends Page{
    private static By name = new By.ById("productTitle");
    private static By author = new By.ByXPath("//*[@id=\"bylineInfo\"]/span/span[1]/a[1] | //span[@class=\"author notFaded\"]");
    private static By bestseller = new By.ByXPath("//*[@id=\"zeitgeistBadge_feature_div\"]/div/a/i");

    public static Book getBook(String url){
        Book book = new Book();
        open(url);
        book.setName(element(name).getText());
        book.setAuthor(element(author).getText());
        book.setBestseller(element(bestseller).exists());
        return book;
    }
}
