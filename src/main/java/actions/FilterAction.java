package actions;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.BathAndShowerCurtainsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class FilterAction {
    private final BathAndShowerCurtainsPage bathAndShowerCurtainsPage;
    private final SortingAction sortingAction;

    public FilterAction() {
        bathAndShowerCurtainsPage = new BathAndShowerCurtainsPage();
        sortingAction = new SortingAction();
    }

    public void useRozetkaFilter() {
        bathAndShowerCurtainsPage.getRozetkaCheckbox().shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void checkFilterIsApplied(final String filterText) {
        bathAndShowerCurtainsPage.getFilterText().first().shouldHave(text(filterText));
    }

    public void deleteFilter() {
        bathAndShowerCurtainsPage.getFilterDeleteButton().shouldBe(visible);
    }

    public void useReadyToSendFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(2).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void checkFilterIsApplied() {
        bathAndShowerCurtainsPage.getFilterText().first().shouldBe(visible);
    }

    public void useBrandFilter() {
        bathAndShowerCurtainsPage.getBrandCheckbox().shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void getProductNamesAndCheckForBrandName(final String brandName) {
        for (int i = 0; i < bathAndShowerCurtainsPage.getProductPricesText().size(); i++) {
            bathAndShowerCurtainsPage.getProductNamesText().get(i).shouldHave(text(brandName));
        }
    }

    public void setPriceRange(final int minPrice, final int maxPrice) {
        bathAndShowerCurtainsPage.getLowestPriceSlider().shouldBe(Condition.visible);
        Selenide.actions().dragAndDropBy(bathAndShowerCurtainsPage.getLowestPriceSlider(), minPrice, 0).build().perform();
        Selenide.actions().dragAndDropBy(bathAndShowerCurtainsPage.getHighestPriceSlider(), maxPrice, 0).build().perform();
    }

    public void clickOnSetPriceButton() {
        bathAndShowerCurtainsPage.getSetPriceButton().shouldBe(Condition.enabled).click(ClickOptions.usingJavaScript().offsetX(10));
    }

    public void useColorFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(115).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useMaterialFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(127).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useCountryFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(136).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useRegisterCountryFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(159).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useStockFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(164).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

    public void useAvailableFilter() {
        bathAndShowerCurtainsPage.getCheckbox().get(165).shouldBe(Condition.visible).click(ClickOptions.usingJavaScript().offsetX(-30));
    }

}
