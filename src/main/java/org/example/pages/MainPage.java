package org.example.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class MainPage extends Page{
    private By searchField = new By.ByXPath("//*[@id=\"twotabsearchtextbox\"]");
    private By allBt = new By.ByXPath("//*[@id=\"nav-search-dropdown-card\"]/div");

    public void open(){
        Selenide.open("https://www.amazon.com");
    }

    public void selectBoxItem(int number){
        element(allBt).click();
        element(byXpath("//*[@id=\"searchDropdownBox\"]/option[" + number +"]")).click();
    }

    public void doSearch(String queue){
        element(searchField)
                .setValue(queue)
                .pressEnter();
    }
}
