import org.example.Main;
import org.example.Pad;
import org.testng.annotations.*;

public class TestSet extends TestBase {

    @Test (groups = "smoke")
    public void testSet1() {
        double result = 0;
        System.out.println("Successful unit test");
    }

    @Test (groups = {"smoke", "regress"})
    public void failedTestSet1() {
        double result = 5;
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Run before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Run after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Run before TestRun");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Run after TestRun");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("Run before Group");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("Run before Group");
    }
}

