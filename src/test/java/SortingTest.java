import actions.SortingAction;
import com.google.common.collect.Ordering;
import org.testng.Assert;
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
        sortingAction.closeBanner();
    }

    @Test(description = "Check sorting from cheap to expensive")
    private void sortingFromCheapToExpensive() {
        sortingAction.chooseSortingType(SortingType.cheap);
        sortingAction.getPriceListOfPageOne();
        Assert.assertTrue(Ordering.natural().isOrdered(sortingAction.getPriceListOfPageOne()));
    }

    @Test(description = "Check sorting from expensive to cheap")
    private void sortingFromExpensiveToCheap() {
        sortingAction.chooseSortingType(SortingType.expensive);
        Assert.assertTrue(Ordering.natural().reverse().isOrdered(sortingAction.getPriceListOfPageOne()));
    }

}
