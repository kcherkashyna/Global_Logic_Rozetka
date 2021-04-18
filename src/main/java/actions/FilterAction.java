package actions;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import pages.BathAndShowerCurtainsPage;

import java.util.Collections;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class FilterAction {
    private final BathAndShowerCurtainsPage BATH_AND_SHOWER_CURTAINS_PAGE;
    private final SortingAction SORTING_ACTION;

    public FilterAction() {
        BATH_AND_SHOWER_CURTAINS_PAGE = new BathAndShowerCurtainsPage();
        SORTING_ACTION = new SortingAction();
    }

    public void useRozetkaFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getRozetkaCheckbox().shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void checkFilterIsApplied(final String filterText) {
        BATH_AND_SHOWER_CURTAINS_PAGE.getFilterText().shouldHave(text(filterText));
    }

    public void deleteFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getFilterDeleteButton();
    }

    public void useReadyToSendFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(2).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void checkFilterIsApplied() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getFilterText().shouldBe(visible);
    }

    public void useBrandFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getBrandCheckbox().shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void getProductNamesAndCheckForBrandName(final String brandName) {
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(0).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(1).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(2).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(3).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(4).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(5).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(6).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(7).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(8).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(9).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(10).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(11).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(12).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(13).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(14).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(15).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(16).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(17).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(18).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(19).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(20).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(21).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(22).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(23).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(24).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(25).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(26).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(27).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(28).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(29).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(30).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(31).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(32).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(33).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(34).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(35).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(36).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(37).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(38).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(39).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(40).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(41).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(42).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(43).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(44).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(45).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(46).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(47).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(48).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(49).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(50).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(51).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(52).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(53).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(54).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(55).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(56).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(57).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(58).shouldHave(text(brandName));
        BATH_AND_SHOWER_CURTAINS_PAGE.getProductNamesText().get(59).shouldHave(text(brandName));

    }

    public void setPriceRange(final int minPrice, final int maxPrice) {
        BATH_AND_SHOWER_CURTAINS_PAGE.getLowestPriceSlider().shouldBe(Condition.visible);
        Selenide.actions().dragAndDropBy(BATH_AND_SHOWER_CURTAINS_PAGE.getLowestPriceSlider(), minPrice, 0).build().perform();
        Selenide.actions().dragAndDropBy(BATH_AND_SHOWER_CURTAINS_PAGE.getHighestPriceSlider(), maxPrice, 0).build().perform();
    }

    public void clickOnSetPriceButton() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getSetPriceButton().shouldBe(Condition.enabled).click(ClickOptions.usingJavaScript().offsetX(10));
    }

    public void checkHighestAndLowestPriceOnPage(final int minPrice, final int maxPrice) {
        Assert.assertTrue((Integer.valueOf((Integer) Collections.min(SORTING_ACTION.getPriceListOfPageOne()))>=minPrice)&&
                (Integer.valueOf((Integer) Collections.max(SORTING_ACTION.getPriceListOfPageOne()))<=maxPrice));
    }


    public void useColorFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(115).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useMaterialFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(127).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useCountryFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(136).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useRegisterCountryFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(159).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useStockFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(164).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useAvailableFilter() {
        BATH_AND_SHOWER_CURTAINS_PAGE.getCheckbox().get(165).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }


}
