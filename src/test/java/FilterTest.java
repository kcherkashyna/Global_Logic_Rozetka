import actions.FilterAction;
import actions.SortingAction;
import com.google.common.collect.Ordering;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Configuration;

public class FilterTest {
    private FilterAction filterAction;
    private Configuration configuration;
    private SortingAction sortingAction;

    @BeforeMethod
    private void opeSite() {
        filterAction = new FilterAction();
        configuration = new Configuration();
        sortingAction = new SortingAction();
        configuration.openSite();
    }

    @Test(description = "Check Seller filter")
    private void useSellerFilterCheckItAndDelete() {
        filterAction.useRozetkaFilter();
        filterAction.checkFilterIsApplied("Rozetka");
    }

    @Test(description = "Check Ready to send filter")
    private void useReadyToSendFilterCheckItAndDelete() {
        filterAction.useReadyToSendFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Brand filter")
    private void useBrandFilterCheckItAndDelete() {
        filterAction.useBrandFilter();
        filterAction.checkFilterIsApplied("Miranda");
        filterAction.getProductNamesAndCheckForBrandName("Miranda");
    }

    @Test(description = "Check Price filter")
    private void usePriceRangeCheckItAndDelete() {
        filterAction.setPriceRange(20, -30);
        filterAction.clickOnSetPriceButton();
        filterAction.checkFilterIsApplied();
        Assert.assertTrue(((Integer) Ordering.natural().min(sortingAction.getPriceListOfPageOne()) >= 4388)&&
                ((Integer) Ordering.natural().max(sortingAction.getPriceListOfPageOne()) <=29852));
    }

    @Test(description = "Check Color filter")
    private void useColorFilterCheckItAndDelete() {
        filterAction.useColorFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Material filter")
    private void useMaterialFilterCheckItAndDelete() {
        filterAction.useMaterialFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Country filter")
    private void useCountryFilterCheckItAndDelete() {
        filterAction.useCountryFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Register country filter")
    private void useRegisterCountryFilterCheckItAndDelete() {
        filterAction.useRegisterCountryFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Stock filter")
    private void useStockFilterCheckItAndDelete() {
        filterAction.useStockFilter();
        filterAction.checkFilterIsApplied();
    }

    @Test(description = "Check Available filter")
    private void useAvailableFilterCheckItAndDelete() {
        filterAction.useAvailableFilter();
        filterAction.checkFilterIsApplied();
    }

    @AfterMethod
    private void deleteFilterAfterUsing(){
        filterAction.deleteFilter();
    }

}
