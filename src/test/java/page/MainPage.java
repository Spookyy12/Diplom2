package page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public SelenideElement buttonReady = $x("//*[@id='root']/div/button[1]/span");
    public SelenideElement cardHolderNumber = $x("//*[@id=\"root\"]/div/form/fieldset/div[1]/span/span/span[2]/input");
    public SelenideElement cardHolderMonthDate = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[1]/span/span/span[2]/input");
    public SelenideElement cardHolderYearDate = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[2]/span/span/span[2]/input");
    public SelenideElement cardHolderName = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[1]/span/span/span[2]/input");
    public SelenideElement cardHolderCVC = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[2]/span/span/span[2]/input");
    public SelenideElement buttonNext = $x("//*[@id=\"root\"]/div/form/fieldset/div[4]/button/span/span");
    public SelenideElement textCorrect = $(".notification__content");
    public SelenideElement errorFormatFromCard = $x("//*[@id=\"root\"]/div/form/fieldset/div[1]/span/span/span[3]");
    public SelenideElement errorFormatFromMonth = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[1]/span/span/span[3]");
    public SelenideElement errorFormatFromYear = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[2]/span/span/span[3]");
    public SelenideElement errorFormatFromName = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[1]/span/span/span[3]");
    public SelenideElement errorFormatFromCvc = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[2]/span/span/span[3]");
    public SelenideElement errorYear = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[2]/span/span/span[3]");
    public SelenideElement errorExpiredCardYear = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[2]/span/span/span[3]");
    public SelenideElement errorExpiredCardMonth = $x("//*[@id=\"root\"]/div/form/fieldset/div[2]/span/span[1]/span/span/span[3]");
    public SelenideElement errorExpiredCvc = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[2]/span/span/span[3]\n");
    public SelenideElement errorExpiredName = $x("//*[@id=\"root\"]/div/form/fieldset/div[3]/span/span[2]/span/span/span[3]\n");

}