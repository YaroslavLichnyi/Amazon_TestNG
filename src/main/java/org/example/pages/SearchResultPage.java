package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.elements;

public class SearchResultPage extends Page{
    private By bookLinks = new By.ByXPath("//h2//a[@class=\"a-link-normal a-text-normal\"]");

    public List<String> getBookLinks() {
        List<SelenideElement> elements = elements(bookLinks);
        List<String> result = new ArrayList<>();
        for (SelenideElement element: elements) {
            result.add(element.getAttribute("href"));
        }
        return result;
    }
}
