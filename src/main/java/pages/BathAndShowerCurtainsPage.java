package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BathAndShowerCurtainsPage {

    public SelenideElement getBannerCrossButton() {
        return $x("//*[@class='exponea-close-cross']");
    }

    public SelenideElement getCheapSortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='1: cheap']");
    }

    public SelenideElement getExpensiveSortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='2: expensive']");
    }

    public SelenideElement getPopularitySortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='3: popularity']");
    }

    public SelenideElement getNoveltySortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='4: novelty']");
    }

    public SelenideElement getActionSortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='5: action']");
    }

    public SelenideElement getRankSortingTypeFromDropDownList() {
        $x("//*[@value='1: cheap']/parent::*").scrollTo().click();
        return $x("//*[@value='6: rank']");
    }

    public ElementsCollection getProductPricesText() {
        return $$x("//*[@class='goods-tile__price-value']");
    }


    public SelenideElement getLowestPriceSlider() {
        $x("//*[@data-filter-name='price']//*[@class='sidebar-block__toggle-title']").scrollTo();
        return $x("//*[@class='rz-slider__range-button rz-slider__range-button_type_left']");
    }

    public SelenideElement getHighestPriceSlider() {
        return $x("//*[@class='rz-slider__range-button rz-slider__range-button_type_right']");
    }

    public SelenideElement getSetPriceButton() {
        return $x("//*[contains(@class,'slider-filter__button')]");
    }

    public SelenideElement getRozetkaCheckbox() {
        $x("//*[@data-filter-name='seller']//*[@class='sidebar-block__toggle-title']").scrollTo();
        return $x("//*[@for='Rozetka']");
    }

    public SelenideElement getFilterText() {
        return $$x("//*[@class='catalog-selection__link']").first();
    }

    public ElementsCollection getFilterDeleteButton() {
        return $$x("//*[@class='catalog-selection__remove-icon']/*[1]");
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
