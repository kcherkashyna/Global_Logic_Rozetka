package actions;

import pages.BathAndShowerCurtainsPage;
import utils.SortingType;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class SortingAction {
    private final BathAndShowerCurtainsPage bathAndShowerCurtainsPage;

    public SortingAction() {
        bathAndShowerCurtainsPage = new BathAndShowerCurtainsPage();
    }

    public void closeBanner() {
        if (bathAndShowerCurtainsPage.getBannerCrossButton().isDisplayed()) {
            bathAndShowerCurtainsPage.getBannerCrossButton().click();
        }
    }

    public void clickOnSortingButton() {
        bathAndShowerCurtainsPage.getSortingButton().shouldBe(enabled).scrollTo().click();
    }

    public void chooseSortingType(final SortingType sortingType) {
        clickOnSortingButton();
        if (sortingType.equals(SortingType.cheap)) {
            bathAndShowerCurtainsPage.getCheapSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.expensive)) {
            bathAndShowerCurtainsPage.getExpensiveSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.popularity)) {
            bathAndShowerCurtainsPage.getPopularitySortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.novelty)) {
            bathAndShowerCurtainsPage.getNoveltySortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.action)) {
            bathAndShowerCurtainsPage.getActionSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.rank)) {
            bathAndShowerCurtainsPage.getRankSortingTypeFromDropDownList().shouldBe(visible).click();
        }
    }

    public List getPriceListOfPageOne() {
        var productPrices = new ArrayList();
        for (int i = 0; i < bathAndShowerCurtainsPage.getProductPricesText().size(); i++) {
            productPrices.add(Integer.valueOf(bathAndShowerCurtainsPage.getProductPricesText().get(i).getText().replaceAll("\\s+", "")));
        }
        return productPrices;
    }

}
