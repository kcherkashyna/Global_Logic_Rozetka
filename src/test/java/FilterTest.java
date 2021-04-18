import actions.FilterAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Configuration;

public class FilterTest {
    private FilterAction filterAction;
    private Configuration configuration;

    @BeforeMethod
    private void opeSite() {
        filterAction = new FilterAction();
        configuration = new Configuration();
        configuration.openSite();
    }

    @Test(description = "Check Seller filter")
    private void useSellerFilterCheckItAndDelete() {
        filterAction.useRozetkaFilter();
        filterAction.checkFilterIsApplied("Rozetka");
        filterAction.deleteFilter();
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
        filterAction.deleteFilter();
    }

    @Test(description = "Check Price filter")
    private void usePriceRangeCheckItAndDelete() {
        filterAction.setPriceRange(20, -30);
        filterAction.clickOnSetPriceButton();
        filterAction.checkHighestAndLowestPriceOnPage(4388, 29852);
    }

    @Test(description = "Check Color filter")
    private void useColorFilterCheckItAndDelete() {
        filterAction.useColorFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

    @Test(description = "Check Material filter")
    private void useMaterialFilterCheckItAndDelete() {
        filterAction.useMaterialFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

    @Test(description = "Check Country filter")
    private void useCountryFilterCheckItAndDelete() {
        filterAction.useCountryFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

    @Test(description = "Check Register country filter")
    private void useRegisterCountryFilterCheckItAndDelete() {
        filterAction.useRegisterCountryFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

    @Test(description = "Check Stock filter")
    private void useStockFilterCheckItAndDelete() {
        filterAction.useStockFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

    @Test(description = "Check Available filter")
    private void useAvailableFilterCheckItAndDelete() {
        filterAction.useAvailableFilter();
        filterAction.checkFilterIsApplied();
        filterAction.deleteFilter();
    }

}
