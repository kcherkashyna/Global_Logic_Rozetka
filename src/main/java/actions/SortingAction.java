package actions;

import org.testng.Assert;
import pages.BathAndShowerCurtainsPage;
import utils.SortingType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.refresh;

public class SortingAction {
    private final BathAndShowerCurtainsPage BATH_AND_SHOWER_CURTAINS_PAGE;
    private List productPrices;
    private List sortedFromExpensiveToCheapPrices;
    private List sortedFromCheapToExpensivePrices;

    public SortingAction() {
        BATH_AND_SHOWER_CURTAINS_PAGE = new BathAndShowerCurtainsPage();
    }

    public void closeBanner() {
        if (BATH_AND_SHOWER_CURTAINS_PAGE.getBannerCrossButton().isDisplayed()) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getBannerCrossButton().click();
        }
    }

    public void chooseSortingTypeAndRefreshPage(final SortingType sortingType) {
        if (sortingType.equals(SortingType.cheap)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getCheapSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.expensive)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getExpensiveSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.popularity)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getPopularitySortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.novelty)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getNoveltySortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.action)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getActionSortingTypeFromDropDownList().shouldBe(visible).click();
        } else if (sortingType.equals(SortingType.rank)) {
            BATH_AND_SHOWER_CURTAINS_PAGE.getRankSortingTypeFromDropDownList().shouldBe(visible).click();
        }
        refresh();
    }

    public List getPriceListOfPageOne() {
        productPrices = new ArrayList();
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(0).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(1).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(2).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(3).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(4).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(5).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(6).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(7).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(8).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(9).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(10).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(11).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(12).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(13).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(14).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(15).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(16).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(17).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(18).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(19).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(20).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(21).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(22).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(23).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(24).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(25).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(26).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(27).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(28).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(29).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(30).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(31).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(32).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(33).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(34).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(35).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(36).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(37).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(38).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(39).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(40).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(41).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(42).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(43).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(44).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(45).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(46).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(47).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(48).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(49).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(50).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(51).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(52).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(53).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(54).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(55).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(56).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(57).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(58).getText().replaceAll("\\s+", "")));
        productPrices.add(Integer.valueOf(BATH_AND_SHOWER_CURTAINS_PAGE.getProductPricesText().get(59).getText().replaceAll("\\s+", "")));
        return productPrices;
    }

    public void sortFromCheapToExpensiveAndCheckResultList() {
        sortedFromCheapToExpensivePrices = productPrices;
        Collections.sort(sortedFromCheapToExpensivePrices);
        System.out.println(getPriceListOfPageOne());
        System.out.println(sortedFromCheapToExpensivePrices);
        Assert.assertTrue(getPriceListOfPageOne().equals(sortedFromCheapToExpensivePrices));
    }

    public void sortFromExpensiveToCheapAndCheckResultList() {
        sortedFromExpensiveToCheapPrices = productPrices;
        Collections.sort(sortedFromExpensiveToCheapPrices);
        Collections.reverse(sortedFromExpensiveToCheapPrices);
        System.out.println(getPriceListOfPageOne());
        System.out.println(sortedFromExpensiveToCheapPrices);
        Assert.assertTrue(getPriceListOfPageOne().equals(sortedFromExpensiveToCheapPrices));

    }

}
