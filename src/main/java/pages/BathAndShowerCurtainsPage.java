package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BathAndShowerCurtainsPage {

    public SelenideElement getBannerCrossButton() {
        return $x("//*[@class='exponea-close-cross']");
    }

    public SelenideElement getSortingButton() {
        return $x("//*[@value='1: cheap']/parent::*");
    }

    public SelenideElement getCheapSortingTypeFromDropDownList() {
        return $x("//*[@value='1: cheap']");
    }

    public SelenideElement getExpensiveSortingTypeFromDropDownList() {
        return $x("//*[@value='2: expensive']");
    }

    public SelenideElement getPopularitySortingTypeFromDropDownList() {
        return $x("//*[@value='3: popularity']");
    }

    public SelenideElement getNoveltySortingTypeFromDropDownList() {
        return $x("//*[@value='4: novelty']");
    }

    public SelenideElement getActionSortingTypeFromDropDownList() {
        return $x("//*[@value='5: action']");
    }

    public SelenideElement getRankSortingTypeFromDropDownList() {
        return $x("//*[@value='6: rank']");
    }

    public ElementsCollection getProductPricesText() {
        return $$x("//*[@class='goods-tile__price-value']");
    }

    public SelenideElement getLowestPriceSlider() {
        return $x("//*[@class='rz-slider__range-button rz-slider__range-button_type_left']");
    }

    public SelenideElement getHighestPriceSlider() {
        return $x("//*[@class='rz-slider__range-button rz-slider__range-button_type_right']");
    }

    public SelenideElement getSetPriceButton() {
        return $x("//*[contains(@class,'slider-filter__button')]");
    }

    public SelenideElement getRozetkaCheckbox() {
        return $x("//*[@for='Rozetka']");
    }

    public ElementsCollection getFilterText() {
        return $$x("//*[@class='catalog-selection__link']");
    }

    public SelenideElement getFilterDeleteButton() {
        return $x("//*[@class='catalog-selection__remove-icon']/*[1]");
    }

    public ElementsCollection getCheckbox() {
        return $$x("//*[@class='checkbox-filter__link']//*[2]");
    }

    public SelenideElement getBrandCheckbox() {
        return $x("//*[@for='Miranda']");
    }

    public ElementsCollection getProductNamesText() {
        return $$x("//*[@class='goods-tile__title']");
    }

}
