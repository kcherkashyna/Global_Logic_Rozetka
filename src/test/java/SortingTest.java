import actions.SortingAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Configuration;
import utils.SortingType;

public class SortingTest {
    private SortingAction sortingAction;
    private Configuration configuration;

    @BeforeMethod
    private void openSite() {
        sortingAction = new SortingAction();
        configuration = new Configuration();
        configuration.openSite();
    }

    @Test(description = "Check sorting from cheap to expensive")
    private void sortingFromCheapToExpensive() {
        sortingAction.closeBanner();
        sortingAction.chooseSortingTypeAndRefreshPage(SortingType.cheap);
        sortingAction.getPriceListOfPageOne();
        sortingAction.sortFromCheapToExpensiveAndCheckResultList();

    }

    @Test(description = "Check sorting from expensive to cheap")
    private void sortingFromExpensiveToCheap() {
        sortingAction.closeBanner();
        sortingAction.chooseSortingTypeAndRefreshPage(SortingType.expensive);
        sortingAction.getPriceListOfPageOne();
        sortingAction.sortFromExpensiveToCheapAndCheckResultList();
    }

}
